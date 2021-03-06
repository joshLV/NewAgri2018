/**
 * Created by sen on 2017/11/17.
 */

define(['app','constants','layer','jsonDB','config'], function (app,constants,layer,jsonDB,config) {
    'use strict';
    app.registerController('UIPrPoEnGuaranteeQueryCtrl', ['$rootScope', '$scope','$$finder','$http','$filter','$state','commonApiServ','$window','$$code',
        function ($rootScope,$scope,$$finder,$http,$filter,$state,commonApiServ,$window,$$code) {
            $scope.selectListData={};// 级联下拉列表数据
           $scope.getPolicyInfo=function(policyNo){
               $("html,body").css({overflow:"auto"});//出现滚动条
                $state.go('UIPolicy3107show',{'policyNo':policyNo,norepeat:true})
            }
            var obj={
                "riskCode": "2801",
                "policyNo":"",//保单号
                "proposalNo":"",//投保单号
                "printNo": "0",
                "printFlag":"",//打印状态 0/1
                "appliCode": "",//投保人代码
                "queryFlag": "1",//如果是保单查询是1，批改是2
                "appliName": "",//投保人名称
                "insuredCode": "",//被保人代码
                "insuredName": "",//被保人名称
                "startDate": "",//起保日期
                "startDateEnd": "",
                "endDate": "",//终保日期
                "endStartDate": "",
                "sumAmount": "",//总保额
                "sumPremium": "",//总保费
                "makeCom": "",
                "handlerCode": "",//业务员代码
                "operatorCode": "",//操作员代码
                "operateStartDate": "",//制单日期起期
                "operateDateEnd": "",//制单日期止期
                "businessType1": "",//政策商业标志
                "underWriteFlag": "",//投保状态
                "userCode":"01110003",
                "loginComCode":"01180000",
                "loginGradeCodes":"111",
                "tableName":"PrpDcompany",
                "userCodeFields":"userCode",
                "comCodeFields":"comCode",
                "comCode": "",//归属机构
                "pageNo": 1,// 1,
                "pageSize": 5,//5,

            };
            $scope.proposal = {};//查询条件的对象
            $scope.check={};
            $scope.proposal.QueryList = {};//接口查询回来的
            $scope.proposal.prpTmain = {};
            $scope.proposal.prpTmain.pageNo = 1;
            $scope.proposal.prpTmain.pageSize = 20;
            $scope.proposal.prpTmain.printFlag='0';
            $scope.getdate = commonApiServ.setDateTime();
            //$scope.proposal.prpTmain.startDate = $filter('date')(new Date().setDate('01'),'yyyy-MM-dd');//起保开始时间
            //$scope.proposal.prpTmain.startDateEnd = $filter('date')(new Date(),'yyyy-MM-dd');//起保开始时间
            //$scope.proposal.prpTmain.endDate = $filter('date')(new Date().setDate('01'),'yyyy-MM-dd');//终保时间
            //$scope.proposal.prpTmain.endStartDate = $filter('date')(new Date(),'yyyy-MM-dd');//终保时间
            //$scope.proposal.prpTmain.operateDateStart = $filter('date')(new Date().setDate('01'),'yyyy-MM-dd');//制单开始日期
            //$scope.proposal.prpTmain.operateDateEnd = $filter('date')(new Date(),'yyyy-MM-dd');//制单截止日期
            /*//$scope.getdate1 = commonApiServ.getNextYearFullDate($scope.proposal.prpTmain.startDate,1,2);//起保截止时间
            $scope.proposal.prpTmain.operateStartDate = $filter('date')(new Date().setDate('01'),'yyyy-MM-dd');
            $scope.proposal.prpTmain.operateEndDate = $filter('date')(new Date(),'yyyy-MM-dd');*/
            $scope.underWriteFlagList = [{'codeCode': '', 'codeName': '所有'},{'codeCode': '0', 'codeName': '普通新保'}, {'codeCode': '1', 'codeName': '通过'}, {'codeCode': '2', 'codeName': '未通过'}, {'codeCode': '3', 'codeName': '无需核保'}, {'codeCode': '9', 'codeName': '待核保'}];

            //日期校验
            $scope.checkDate = function(x,y){
                if(commonApiServ.compareFullDate(x,y) == 1){
                    $scope.proposal.prpTmain.operateEndDate =''+$scope.getdate.year+'-'+$scope.getdate.month+'-'+ $scope.getdate.day;
                    layer.open({
                        skin: 'large-layer-content',
                        closeBtn: 0,
                        title: '温馨提示',
                        scrollbar: false,
                        content: '制单截止日期不能早于制单起始日期',
                        btn: ['确定'],
                        btn1: function (index, layero) {
                            layer.close(index);
                        }
                    });
                }
            }
            // 获取归属机构下拉列表
            $scope.getComCodeList=function(){
                var comCodeData={
                    comCode: '',
                    comCName: '',
                    riskCode: '',
                    gradeCodes: '111',
                    userCode: $scope.user.userCode,
                    loginComCode: $scope.user.loginComCode
                };
                $$code.getCodes('codeType', 'queryComCodeInfo', { },comCodeData).then(function (data) {
                    $scope.selectListData.comCodeList = data;
                });
            };
            //提交查询信息
            $scope.totalItems=0;
            var cont;
            $scope.proposal.prpTmain.policyNo=null;
            $scope.proposal.prpTmain.proposalNo=null;
            $scope.submit=function(){

                if(
                    ($scope.proposal.prpTmain.policyNo!=null&&$scope.proposal.prpTmain.policyNo != "")
                    ||( $scope.proposal.prpTmain.appliName!="" && $scope.proposal.prpTmain.appliName!=undefined)
                    ||($scope.proposal.prpTmain.appliCode!=""&&$scope.proposal.prpTmain.appliCode!=undefined)
                    ||($scope.proposal.prpTmain.insuredName!=""&&$scope.proposal.prpTmain.insuredName!=undefined)
                    ||($scope.proposal.prpTmain.insuredCode!="" &&$scope.proposal.prpTmain.insuredCode!=undefined )
                    ||($scope.proposal.prpTmain.proposalNo!="" &&$scope.proposal.prpTmain.proposalNo!=null)
                    //cherry.find.js有些数据数据写死，暂时注掉部分属性
                    ||($scope.proposal.prpTmain.sumAmount!=undefined&&$scope.proposal.prpTmain.sumAmount!="")
                    ||($scope.proposal.prpTmain.sumPremium!=undefined&&$scope.proposal.prpTmain.sumPremium!="")
                    ||($scope.proposal.prpTmain.comCode!=undefined&&$scope.proposal.prpTmain.comCode!="")
                    ||($scope.proposal.prpTmain.handlerCode!=undefined&&$scope.proposal.prpTmain.handlerCode!="")
                    ||($scope.proposal.prpTmain.operatorCode!=undefined&&$scope.proposal.prpTmain.operatorCode!="")
                    ||($scope.proposal.prpTmain.startDate!=undefined&&$scope.proposal.prpTmain.startDate!="")
                    ||($scope.proposal.prpTmain.startDateEnd!=undefined&&$scope.proposal.prpTmain.startDateEnd!="")
                    ||($scope.proposal.prpTmain.endDate!=undefined&&$scope.proposal.prpTmain.endDate!="")
                    ||($scope.proposal.prpTmain.endStartDate!=undefined&&$scope.proposal.prpTmain.endStartDate!="")
                    ||($scope.proposal.prpTmain.operateDateStart!=undefined&&$scope.proposal.prpTmain.operateDateStart!="")
                    ||($scope.proposal.prpTmain.operateDateEnd!=undefined&&$scope.proposal.prpTmain.operateDateEnd!="")
                    ||($scope.proposal.prpTmain.printFlag!=undefined&&$scope.proposal.prpTmain.printFlag!="")
                    ||($scope.proposal.prpTmain.BusinessType1!=undefined&&$scope.proposal.prpTmain.BusinessType1!="")
                ) {
                    var proposalNoReg =/^\d{15,}$/;//至少15位数字
                    var appliNameReg=/^[\u4E00-\u9FA50-9]+$/;// 数字汉子
                    var sumAmountRge=/^[0-9]+([.]{1}[0-9]+){0,1}$/;//数字
                    var appliCodeReg=/^[A-Za-z0-9]+$/;//数字  字母
                    var comCodeReg=/(^[\u4E00-\u9FA5]+$)|(^[0-9]+$)/;
                    var content="";
                    if($scope.proposal.prpTmain.policyNo&&!proposalNoReg.test($scope.proposal.prpTmain.policyNo)){
                        var reg=/^\d+$/;
                        if(reg.test($scope.proposal.prpTmain.policyNo)){
                            if($scope.proposal.prpTmain.policyNo.length<15){
                                content="保单号码需输入至少15位数！"
                            }
                        }else{
                            content = '保单号码格式错误，请修改!';
                            $scope.proposal.prpTmain.policyNo="";
                        }
                    }else if($scope.proposal.prpTmain.appliName&&!appliNameReg.test($scope.proposal.prpTmain.appliName)){
                        //投保人名称
                        content="投保人名称格式错误，请修改!";
                        $scope.proposal.prpTmain.appliName="";
                    }else if($scope.proposal.prpTmain.appliCode&&!appliCodeReg.test($scope.proposal.prpTmain.appliCode)){
                        //投保人代码
                        content="投保人代码格式错误，请修改!";
                        $scope.proposal.prpTmain.appliCode="";
                    }else if($scope.proposal.prpTmain.insuredCode&&!appliCodeReg.test($scope.proposal.prpTmain.insuredCode)){
                        //被保险人代码
                        content="被保险人代码格式错误，请修改!";
                        $scope.proposal.prpTmain.insuredCode="";
                    }else if($scope.proposal.prpTmain.insuredName&&!appliNameReg.test($scope.proposal.prpTmain.insuredName)){
                        //被保险人名称
                        content="被保险人名称格式错误，请修改!";
                        $scope.proposal.prpTmain.insuredName="";
                    }else if($scope.proposal.prpTmain.proposalNo&&!proposalNoReg.test($scope.proposal.prpTmain.proposalNo)){
                        //投保单号码
                        content = '投保单号码格式错误，请修改!';
                        $scope.proposal.prpTmain.proposalNo="";
                    }else if($scope.proposal.prpTmain.handlerCode&&!appliCodeReg.test($scope.proposal.prpTmain.handlerCode)){
                        //业务员代码
                        content="业务员代码格式错误，请修改!";
                        $scope.proposal.prpTmain.handlerCode="";
                    }else if($scope.proposal.prpTmain.operatorCode&&!appliCodeReg.test($scope.proposal.prpTmain.operatorCode)){
                        //操作员代码
                        content="操作员代码格式错误，请修改!";
                        $scope.proposal.prpTmain.operatorCode="";
                    }else if($scope.proposal.prpTmain.sumAmount&&!sumAmountRge.test($scope.proposal.prpTmain.sumAmount)){
                        //总保险金额
                        content="总保险金额格式错误，请修改!";
                        $scope.proposal.prpTmain.sumAmount="";
                    }else if($scope.proposal.prpTmain.sumPremium&&!sumAmountRge.test($scope.proposal.prpTmain.sumPremium)){
                        //总保险费
                        content="总保险费格式错误，请修改!";
                        $scope.proposal.prpTmain.sumPremium="";
                    }else if($scope.proposal.prpTmain.operateDateStart&&!$scope.proposal.prpTmain.operateDateEnd){
                        content="请输入制单止期！";
                    }else if(!$scope.proposal.prpTmain.operateDateStart&&$scope.proposal.prpTmain.operateDateEnd){
                        content="请输入制单起期！";
                    }
                    if(content){
                        layer.open({
                            /*offset: ['45%', '40%'],*/
                            skin: 'large-layer-content',
                            scrollbar: false,
                            closeBtn: 0,
                            title: '温馨提示',
                            content: content,
                            btn: ['确定'],
                            btn1: function(index, layero){
                                //按钮【按钮一】的回调
                                layer.close(index);
                            }
                        });
                    } else{
                        if($scope.proposal.prpTmain.policyNo){
                            $scope.proposal.prpTmain.startDate = "";
                            $scope.proposal.prpTmain.startDateEnd = "";
                            $scope.proposal.prpTmain.endDate = "";
                            $scope.proposal.prpTmain.endStartDate = "";
                            $scope.proposal.prpTmain.operateDateStart ="";
                            $scope.proposal.prpTmain.operateDateEnd ="";
                        }
                        $scope.paginationConfmm.currentPage=1;
                        $scope.proposal.prpTmain.pageNo = $scope.paginationConfmm.currentPage;
                        $scope.proposal.prpTmain.pageSize = $scope.paginationConfmm.itemsPerPage;
                        $scope.proposal.prpTmain.queryFlag='1';
                        var dto = angular.copy($scope.proposal.prpTmain);
                        $$finder.find('queryPolicyListByConditon', dto, {
                            success: function (data) {
                                if(data.code=="0000"&&data.content.content.length>0){
                                    var list = data.content.content;
                                    angular.forEach(list, function (_data) {
                                        var strOthFlag = _data.othFlag;
                                        if(strOthFlag.substr(3,1)!='2'){
                                            if ( _data.underWriteFlag == '0' && strOthFlag.substr(0,1) == "0") {
                                                _data.othFlag = "普通新保"
                                            }else if( _data.underWriteFlag == '0' && strOthFlag.substr(0,1) == "1"){
                                                _data.othFlag = "续保新保"
                                            }else if( _data.underWriteFlag == '1'){
                                                _data.othFlag = "核保通过"
                                            }else if( _data.underWriteFlag == '2' && strOthFlag.substr(3,1) != "3"){
                                                _data.othFlag = "核保打回"
                                            }else if( _data.underWriteFlag == '2' && strOthFlag.substr(3,1) == "3"){
                                                _data.othFlag = "拒保"
                                            }else if( _data.underWriteFlag == '3'){
                                                _data.othFlag = "自动核保"
                                            }else if( _data.underWriteFlag == '9'){
                                                _data.othFlag = "待核保"
                                            }else if(_data.underWriteFlag == '4'){
                                                _data.othFlag = "见费出单没收费"
                                            }
                                        }
                                        if (strOthFlag.substr(3, 1) == "2") {
                                            _data.othFlag = "已撤单"
                                        }
                                        if (strOthFlag.substr(3, 1) == "1") {
                                            _data.othFlag = "已注销";
                                        }
                                        else if (strOthFlag.substr(2, 1) == "1") {
                                            _data.othFlag = "全单退保";
                                        }
                                        if (strOthFlag.substr(4, 1) == "1") {
                                            _data.othFlag = "已遗失";
                                        }
                                        if (strOthFlag.substr(4, 1) == "1") {
                                            _data.othFlag = "已遗失";
                                        }

                                    })
                                    $scope.proposal.QueryList = list;
                                    $scope.totalItems = data.content.totalCount;
                                    //查询结果条数
                                    $scope.paginationConfmm.totalItems = $scope.totalItems;
                                }else if(data.code=="9999"){
                                    layer.open({
                                        skin: 'large-layer-content',
                                        closeBtn: 0,
                                        title: '温馨提示',
                                        scrollbar: false,
                                        content: '系统异常、请联系管理员！',
                                        btn: ['确定'],
                                        btn1: function (index, layero) {
                                            layer.close(index);
                                        }
                                    });
                                }else if(data.code=="0000"&&data.content.content.length==0){//没查到数据，就清空之前的数据
                                    $scope.proposal.QueryList =[];
                                    $scope.paginationConfmm.totalItems=0;
                                }
                                $scope.select_all="";
                            },
                            error: function (e) {
                                options.error(e);
                            }
                        });
                    }
                }else {
                    var content;
                    content = '至少输入一个查询条件！';
                    layer.open({
                        /*offset: ['45%', '40%'],*/
                        skin: 'large-layer-content',
                        scrollbar: false,
                        closeBtn: 0,
                        title: '温馨提示',
                        content: content,
                        btn: ['确定'],
                        btn1: function(index, layero){
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                }
            }

            // 保单打印
            $scope.printPolicyNo = function(){
                var policyNo = $scope.checked[0];
                var dto=angular.copy( $scope.proposal.QueryList);
                var list=[];
                angular.forEach($scope.proposal.QueryList,function(dto){
                    if(dto.checked){
                        list.push(dto.policyNo);
                    }
                });
                $scope.policylist=list;
                if(list.length<=0){
                    var cont;
                    cont = '未选择打印单号';
                    layer.open({
                        /*offset: ['45%', '40%'],*/
                        skin: 'large-layer-content',
                        closeBtn: 0,
                        title: '温馨提示',
                        scrollbar: false,
                        content: cont,
                        btn: ['确定'],
                        btn1: function(index, layero){
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                }else {
                    layer.open({
                        /*offset: ['45%', '40%'],*/
                        skin: 'large-layer-content',
                        closeBtn: 0,
                        scrollbar: false,
                        title: '温馨提示',
                        content: '是否确认打印！',
                        btn: ['确定', '取消'],
                        btn1: function (index1,layero) {
                            var index = list.length;
                            var print = '';
                            var end = '';
                            for (var i = 0; i < index; i++) {
                                if (i == 0) {
                                    print = 'policyNo=' + list[i];
                                } else {
                                    print = '&policyNo=' + list[i];
                                }
                                end = end + print;
                            }
                            $window.open("/"+config.systemConfig.systemFlag+config.systemConfig.printFile+'?fileID=' + '/api/agriprpall/print/PolicyPrint?' + end);
                            layer.close(index1);
                        },
                        btn2: function (index, layero) {
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                }
            };

            $scope.changeVisaType=function(visaSerialNos){
                angular.forEach(visaSerialNos, function (_data) {
                    if($scope.visaCode==_data.visaCode) {
                        $scope.proposal.visaSerisal=_data.visaSerisal;
                    }
                })

            }
            $scope.policyPrintFlag=true
            //打印设置确定关闭设置页面1
            $scope.printSure = function() {
                //其他打印单独取值
                var dto=angular.copy( $scope.proposal.QueryList);
                var listOther=[];
                var listOther1=[];
                angular.forEach($scope.proposal.QueryList,function(dto){
                    if(dto.checked){
                        listOther.push(dto.policyNo);
                        listOther1.push(dto.proposalNo)
                    }
                });
                var printOther = '';
                var printOther1 = '';
                var endpolicyNoOther = '';//保单号
                var endproposalNoOther='';//投保单号
                for (var i = 0; i < listOther.length; i++) {
                    if (i == 0) {
                        printOther = 'policyNo=' + listOther[i];
                        printOther1 = 'proposalNo=' + listOther1[i];
                    } else {
                        printOther = '&policyNo=' + listOther[i];
                        printOther1 = '&proposalNo=' + listOther1[i];
                    }
                    //保单号
                    endpolicyNoOther = endpolicyNoOther + printOther
                    //投保单号
                    endproposalNoOther = endproposalNoOther + printOther1
                }
                //保单打印取值-校验
                var dto=angular.copy( $scope.proposal.QueryList);
                var list=[];
                var list1=[]
                angular.forEach($scope.proposal.QueryList,function(dto){
                    if(dto.checked&&(dto.underWriteFlag=='1'||dto.underWriteFlag=='3')&&(dto.othFlag != "已注销")){
                        list.push(dto.policyNo);
                        list1.push(dto.proposalNo)
                    }
                });
                var print = '';
                var print1 = '';
                var endpolicyNo = '';//保单号
                var endproposalNo='';//投保单号

                for (var i = 0; i < list.length; i++) {
                    if (i == 0) {
                        print = 'policyNo=' + list[i];
                        print1 = 'proposalNo=' + list1[i];
                    } else {
                        print = '&policyNo=' + list[i];
                        print1 = '&proposalNo=' + list1[i];
                    }
                    //保单号
                    endpolicyNo = endpolicyNo + print
                    //投保单号
                    endproposalNo = endproposalNo + print1
                }
                var i=0;
                if($scope.printType == 'PolicyPrint'){

                    //保单正本打印
                    if(!$scope.proposal.visaSerisal||$scope.proposal.visaSerisal=='无可使用流水号'){
                        layer.open({
                            /*offset: ['45%', '40%'],*/
                            skin: 'large-layer-content',
                            closeBtn: 0,
                            title: '温馨提示',
                            scrollbar: false,
                            content: '保单打印时流水起始号不能为空!',
                            btn: ['确定'],
                            btn1: function(index, layero){
                                //按钮【按钮一】的回调
                                layer.close(index);
                            }
                        });
                        return false;
                    }
                    if(list.length==0){
                        layer.open({
                            /*offset: ['45%', '40%'],*/
                            skin: 'large-layer-content',
                            closeBtn: 0,
                            title: '温馨提示',
                            scrollbar: false,
                            content: '请重新选择保单!',
                            btn: ['确定'],
                            btn1: function(index, layero){
                                //按钮【按钮一】的回调
                                layer.close(index);
                            }
                        });
                        return false;
                    }
                    //判断保单如果已经打印，就不能再次打印
                    $$finder.find('policyPrintStatus',{
                        "policyNos":list
                    },{
                        success:function(data){
                            $scope.policyPrintList=data.content.policyPrintList;
                            $scope.policyPrintUploadList=data.content.policyPrintUploadList;
                            $scope.policyPrintNo=data.content.policyPrintNo;
                            var listPolicy=[];
                            var listPolicyFile=[];
                            for(i in $scope.policyPrintUploadList){
                                listPolicyFile.push($scope.policyPrintUploadList[i])
                                listPolicy.push(i);
                            }

                            if($scope.policyPrintList.length>0){
                                //已电子下载的保单剔除勾选
                                angular.forEach($scope.proposal.QueryList,function(dto){
                                    if(dto.checked&&($.inArray(dto.policyNo,listPolicy)>-1)){
                                        dto.checked=false;
                                    }
                                });
                                layer.open({
                                    //offset: ['38%', '31%'],
                                    skin: 'large-layer-content',
                                    scrollbar: false,
                                    closeBtn: 0,
                                    title: '温馨提示',
                                    content: '保单号'+$scope.policyPrintList+'已打印,是否单号作废!',
                                    btn: ['确定', '取消'],
                                    btn1: function(index5, layero){
                                        //按钮【按钮一】的回调
                                        layer.close(index5);
                                        $$finder.find('trashTransVisa',{
                                            "userCode":$rootScope.user.userCode,
                                            "visaCode":$scope.visaCodeGuarantee ,
                                            "businessNos":list
                                        },{
                                            success:function(data){
                                                var cont="";
                                                if(data.code=="0000"){
                                                    cont="单号作废成功，请重新查询打印!"
                                                }else{
                                                    cont="单号作废成失败，请重新作废!"
                                                }
                                                layer.open({
                                                    //offset: ['38%', '31%'],
                                                    skin: 'large-layer-content',
                                                    scrollbar: false,
                                                    closeBtn: 0,
                                                    title: '温馨提示',
                                                    content:cont ,
                                                    btn: ['确定'],
                                                    btn1: function(index3, layero){
                                                        layer.close(index3);
                                                    }
                                                });
                                            },
                                            error:function(e){
                                                options.error(e);
                                            }
                                        })
                                    },
                                    btn2: function (index1, layero) {
                                        //按钮【按钮一】的回调
                                        layer.close(index1);
                                    }

                                });

                            }else if(listPolicy.length>0){
                                layer.open({
                                    skin: 'large-layer-content',
                                    closeBtn: 0,
                                    title: '温馨提示',
                                    scrollbar: false,
                                    content: '已经电子保单下载的保单不能正本打印!',
                                    btn: ['确定'],
                                    btn1: function(index, layero){
                                        //按钮【按钮一】的回调
                                        layer.close(index);
                                    }
                                });
                                //已电子下载的保单剔除勾选
                                angular.forEach($scope.proposal.QueryList,function(dto){
                                    if(dto.checked&&($.inArray(dto.policyNo,listPolicy)>-1)){
                                        dto.checked=false;
                                    }
                                });
                            }else {
                                $window.open("/" + config.systemConfig.systemFlag + config.systemConfig.printFile + '?fileID=' + '/api/agriprpall/print/PolicyPrint?' + endpolicyNo + '&&comCode=' + $rootScope.user.loginComCode + '&&visaCode=' + $scope.visaCodeGuarantee + '&&visaSerialNo=' + $scope.proposal.visaSerisal+'&&userCode='+ $rootScope.user.userCode);

                            }
                        },
                        error:function(e){
                            options.error(e);
                        }
                    });
                }else if($scope.printType == 'PolicyPrint1'){
                    if(list.length==0){
                        layer.open({
                            /*offset: ['45%', '40%'],*/
                            skin: 'large-layer-content',
                            closeBtn: 0,
                            title: '温馨提示',
                            scrollbar: false,
                            content: '请先打印保单正本!',
                            btn: ['确定'],
                            btn1: function(index, layero){
                                //按钮【按钮一】的回调
                                layer.close(index);
                            }
                        });
                        return false;
                    }
                    //判断保单如果没有正本打印，就不能打印副本
                    $$finder.find('policyPrintStatus',{
                        "policyNos":list
                    },{
                        success:function(data){
                            $scope.policyPrintList=data.content.policyPrintList;//正本打印
                            $scope.policyPrintUploadList=data.content.policyPrintUploadList;//电子保单下载
                            $scope.policyPrintNo=data.content.policyPrintNo;//未打印

                            if($scope.policyPrintNo.length>0&&$scope.policyPrintList.length==0){
                                layer.open({
                                    skin: 'large-layer-content',
                                    closeBtn: 0,
                                    title: '温馨提示',
                                    scrollbar: false,
                                    content: '未正本打印的保单不能打印保单副本!',
                                    btn: ['确定'],
                                    btn1: function(index, layero){
                                        //按钮【按钮一】的回调
                                        layer.close(index);
                                    }
                                });
                                //剔除未正本打印的保单
                                //angular.forEach($scope.proposal.QueryList,function(dto){
                                //    if(dto.checked&&($.inArray(dto.policyNo,$scope.policyPrintNo)>-1)){
                                //        dto.checked=false;
                                //    }else if(dto.checked&&(dto.underWriteFlag!='1'||dto.underWriteFlag!='3')||(dto.othFlag == "已注销")){
                                //        dto.checked=false;
                                //    }
                                //});
                            }else if($scope.policyPrintNo.length>0&&$scope.policyPrintList.length>0){
                                //剔除未正本打印的保单
                                angular.forEach($scope.proposal.QueryList,function(dto){
                                    if(dto.checked){
                                        if(($.inArray(dto.policyNo,$scope.policyPrintNo)>-1)||dto.othFlag == "已注销"){
                                            dto.checked=false;
                                        }else if(dto.underWriteFlag!='1'&&dto.underWriteFlag!='3'){
                                            dto.checked=false;
                                        }
                                    }
                                });
                                var policyNoTemp='';
                                var printTemp='';
                                for (var i = 0; i < $scope.policyPrintList.length; i++) {
                                    if (i == 0) {
                                        printTemp = 'policyNo=' + $scope.policyPrintList[i];
                                     } else {
                                        printTemp = '&policyNo=' + $scope.policyPrintList[i];
                                     }
                                    //保单号
                                    policyNoTemp = policyNoTemp + printTemp
                                }
                                layer.open({
                                    skin: 'large-layer-content',
                                    closeBtn: 0,
                                    title: '温馨提示',
                                    scrollbar: false,
                                    content: '已剔除未正本打印的保单，是否继续打印副本？',
                                    btn: ['确定','取消'],
                                    btn1: function(index1, layero){
                                        //按钮【按钮一】的回调
                                        layer.close(index1);
                                        $window.open("/"+config.systemConfig.systemFlag+config.systemConfig.printFile+'?fileID=' + '/api/agriprpall/print/PolicyPrint?' + policyNoTemp);
                                    },
                                    btn2: function(index, layero){
                                        //按钮【按钮一】的回调
                                        layer.close(index);
                                     }
                                });

                            }else {
                                //保单副本打印
                                $window.open("/"+config.systemConfig.systemFlag+config.systemConfig.printFile+'?fileID=' + '/api/agriprpall/print/PolicyPrint?' + endpolicyNo);

                            }
                        },
                        error:function(e){
                            options.error(e);
                        }
                    });

                }else if($scope.printType == 'InsuranceFormPrint'){
                    //投保单打印
                    $window.open("/"+config.systemConfig.systemFlag+config.systemConfig.printFile+'?fileID=' + '/api/agriprpall/print/InsuranceFormPrint?' + endproposalNoOther);
                }else if($scope.printType == 'MainPrint'){
                    //主险清单打印
                    $window.open("/"+config.systemConfig.systemFlag+config.systemConfig.printFile+'?fileID=' + '/api/agriprpall/print/MainPrint?' + endpolicyNoOther);
                }else if($scope.printType == 'SpecialyAgreedPrint'){
                    //特别约定打印
                    $window.open("/"+config.systemConfig.systemFlag+config.systemConfig.printFile+'?fileID=' + '/api/agriprpall/print/SpecialyAgreedPrint?' + endpolicyNoOther);
                }else if($scope.printType == 'SubPrint'){
                    //附加险清单打印
                    $window.open("/"+config.systemConfig.systemFlag+config.systemConfig.printFile+'?fileID=' + '/api/agriprpall/print/SubPrint?' + endpolicyNoOther)
                }else if($scope.printType == 'PaymentPlanPrint'){
                    //缴费计划打印
                    $window.open("/"+config.systemConfig.systemFlag+config.systemConfig.printFile+'?fileID=' + '/api/agriprpall/print/PaymentPlanPrint?' + endpolicyNoOther)
                }else if($scope.printType == 'PaymentNoticePrint'){
                    //缴费通知书打印
                    $window.open("/"+config.systemConfig.systemFlag+config.systemConfig.printFile+'?fileID=' + '/api/agriprpall/print/PaymentNoticePrint?' + endpolicyNoOther)
                }else if($scope.printType == 'FilePrint'){
                    //承保卷宗打印
                    $window.open("/"+config.systemConfig.systemFlag+config.systemConfig.printFile+'?fileID=' + '/api/agriprpall/print/FilePrint?' + endpolicyNoOther)
                }else if($scope.printType == 'B5'){
                    //$window.open('/api/agriprpall/templateFile/download?fileType=b5')
                    //B5条款打印
                    var iSwitch=0;
                    if(listOther.length>1){
                        var riskcode=listOther[0].policyNo.substring(1,5);
                        angular.forEach(listOther,function(item){
                            if(riskcode!=item.policyNo.substring(1,5)){
                                iSwitch=2;
                            }
                        })
                    }
                    if(iSwitch==2){
                        layer.open({
                            /*offset: ['45%', '40%'],*/
                            skin: 'large-layer-content',
                            closeBtn: 0,
                            title: '温馨提示',
                            scrollbar: false,
                            content: '险种不一致的保单不能下载!',
                            btn: ['确定'],
                            btn1: function(index, layero){
                                //按钮【按钮一】的回调
                                layer.close(index);
                            }
                        });
                        return false;
                    }
                    var riskB5=listOther[0].substring(1,5);
                    var com=listOther[0].substring(5,7);
                    if(riskB5=='3107'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3107'+com)
					}else if(riskB5=='3101'){
						$window.open('/api/agriprpall/templateFile/download?fileType=3101'+com)		
					}else if(riskB5=='3114'){
						$window.open('/api/agriprpall/templateFile/download?fileType=3114'+com)	
					}else if(riskB5=='3122'){
						$window.open('/api/agriprpall/templateFile/download?fileType=3122'+com)	
					}else if(riskB5=='3126'){
						$window.open('/api/agriprpall/templateFile/download?fileType=3126'+com)
					}else if(riskB5=='3161'){
						$window.open('/api/agriprpall/templateFile/download?fileType=3161'+com)		
                    }else if(riskB5=='3102'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3102'+com)
                    }else if(riskB5=='3108'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3108'+com)
                    }else if(riskB5=='3129'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3129'+com)
                    }else if(riskB5=='3130'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3130'+com)
                    }else if(riskB5=='3134'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3134'+com)
                    }else if(riskB5=='3141'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3141'+com)
                    }else if(riskB5=='3147'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3147'+com)
                    }else if(riskB5=='3155'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3155'+com)
                    }else if(riskB5=='3162'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3162'+com)
                    }else if(riskB5=='3220'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3220'+com)
                    }else if(riskB5=='3224'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3224'+com)
                    }else if(riskB5=='3233'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3233'+com)
                    }else if(riskB5=='3237'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3237'+com)
                    }else if(riskB5=='3149'){
                        $window.open('/api/agriprpall/templateFile/download?fileType=3149'+com)
                    }

                }

            };
            //打印设置弹出
            $scope.configPrintSetShow = false;
            var visaSerialNos=[];
            $scope.configPrintSet = function() {
                $scope.configPrintSetShow = !$scope.configPrintSetShow;
                if($scope.configPrintSetShow){
                    $("html,body").css({overflow:"hidden"});//隐藏滚动条
                }else{
                    $("html,body").css({overflow:"auto"});//显示滚动条
                }
                if($scope.printType=='PolicyPrint' || $scope.printType=='PolicyPrint1' ){
                    $scope.policyDisabled=false
                }else{
                    $scope.policyDisabled=true
                }
            };
            $scope.configOtherPrintSetShow = false;
            $scope.configOtherPrintSet = function(){
                var iSwitch=0;
                angular.forEach($scope.proposal.QueryList,function(dto){
                    if(dto.checked){
                        iSwitch=1;
                    }
                });
                if(iSwitch==0){
                    $scope.configOtherPrintSetShow = false;
                    layer.open({
                        //offset: ['38%', '40%'],
                        skin: 'large-layer-content',
                        scrollbar: false,
                        closeBtn: 0,
                        title: '温馨提示',
                        content: '请选择保单号!',
                        btn: ['确定'],
                        btn1: function(index, layero){
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                    return false;
                }
                $scope.configOtherPrintSetShow = !$scope.configOtherPrintSetShow;
                if($scope.configOtherPrintSetShow){
                    $("html,body").css({overflow:"hidden"});//隐藏滚动条
                }else{
                    $("html,body").css({overflow:"auto"});//显示滚动条
                }
            }
            //打印设置
            $scope.policyNo="";
            $scope.proposalNo="";
            $scope.config=function(type){
                $scope.printType =type;
                $scope.printlist=[];
                $scope.list=[];
                var iSwitch=0;
                var layerflag=false;
                angular.forEach($scope.proposal.QueryList,function(dto){
                    if(dto.checked&&(dto.underWriteFlag=='1'||dto.underWriteFlag=='3')&&(dto.othFlag != "已注销")){
                        iSwitch=1
                        $scope.list.push(dto);
                    }else if(dto.checked){
                        iSwitch=1
                        layerflag=true;
                        dto.checked=false;
                    }
                });
                //批量打印时险种要求一样
                if($scope.list.length>1){
                    var riskcode=$scope.list[0].policyNo.substring(1,5);
                    angular.forEach($scope.list,function(item){
                        if(riskcode!=item.policyNo.substring(1,5)){
                            iSwitch=2;
                        }
                    })
                }
                if(iSwitch==0){
                    layer.open({
                        //offset: ['38%', '40%'],
                        skin: 'large-layer-content',
                        scrollbar: false,
                        closeBtn: 0,
                        title: '温馨提示',
                        content: '请选择保单号!',
                        btn: ['确定'],
                        btn1: function(index, layero){
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                    return false;
                }else if(iSwitch==2){
                    layer.open({
                        /*offset: ['45%', '40%'],*/
                        skin: 'large-layer-content',
                        closeBtn: 0,
                        title: '温馨提示',
                        scrollbar: false,
                        content: '险种不一致的保单不能批量打印!',
                        btn: ['确定'],
                        btn1: function(index, layero){
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                    return false;
                }

                if($scope.list.length<=0){
                    var cont;
                    cont = '未收费或未核保的保单不可打印,请选择打印正确的保单号!';
                    layer.open({
                        //offset: ['45%', '31%'],
                        skin: 'large-layer-content',
                        scrollbar: false,
                        closeBtn: 0,
                        title: '温馨提示',
                        content: cont,
                        btn: ['确定'],
                        btn1: function(index, layero){
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                    $scope.select_all="";
                }else if($scope.list.length>0&&layerflag) {
                    layer.open({
                        /*offset: ['45%', '40%'],*/
                        skin: 'large-layer-content',
                        scrollbar: false,
                        closeBtn: 0,
                        title: '温馨提示',
                        content: '已剔除未收费或未核保的保单,是否继续打印?',
                        btn: ['确定', '取消'],
                        btn1: function (index, layero) {
                            for (var i = 0; i < 5; i++) {
                                if ($scope.list[i]) {
                                    $scope.printlist.push($scope.list[i]);
                                }
                            }
                            $scope.paginationConfmm1.totalItems = $scope.list.length;
                            $$finder.find('queryVisaCodesAndVisaSerialNos', {
                                "businessNo": $scope.list[0].policyNo.substring(1,5)+','+$scope.list.length,
                                "comCode": $rootScope.user.loginComCode,
                                "userCode":$rootScope.user.userCode
                            }, {
                                success: function (data) {
                                    var visaCodeAndNameList=[]
                                    angular.forEach(data.content, function (_data,index) {
                                        _data.visaSerisal = _data.visaSerisal;
                                        _data.visaType=_data.visaCode+'-'+_data.visaName;
                                        _data.visaCode=_data.visaCode;
                                        visaCodeAndNameList.push(_data)
                                    })
                                    $scope.visaSerialNos=visaCodeAndNameList;
                                    $scope.codeName="";
                                    $scope.visaCodeGuarantee=data.content[0].visaCode;
                                    $scope.codeName = data.content[0].visaCode+'-'+data.content[0].visaName;
                                    $scope.proposal.visaSerisal = data.content[0].visaSerisal;
                                },
                                error: function (e) {
                                    options.error(e);
                                }

                            });
                            layer.close(index);
                            $scope.configPrintSet();
                            $scope.policyNo = $scope.list[0].policyNo;
                            $scope.proposalNo = $scope.list[0].proposalNo;
                        },
                        btn2: function (index1, layero) {
                            //按钮【按钮一】的回调
                            layer.close(index1);
                        }
                    });
                    $scope.select_all="";
                }else{
                    for (var i = 0; i < 5; i++) {
                        if ($scope.list[i]) {
                            $scope.printlist.push($scope.list[i]);
                        }
                    }
                    $scope.paginationConfmm1.totalItems = $scope.list.length;
                    $$finder.find('queryVisaCodesAndVisaSerialNos', {
                        "businessNo":  $scope.list[0].policyNo.substring(1,5)+','+$scope.list.length,
                        "comCode": $rootScope.user.loginComCode,
                        "userCode":$rootScope.user.userCode
                    }, {
                        success: function (data) {
                            var visaCodeAndNameList=[]
                            angular.forEach(data.content, function (_data) {
                                _data.visaSerisal = _data.visaSerisal;
                                _data.visaType=_data.visaCode+'-'+_data.visaName;
                                _data.visaCode=_data.visaCode;
                                visaCodeAndNameList.push(_data)
                            })
                            $scope.visaSerialNos=visaCodeAndNameList;
                            $scope.codeName="";
                            $scope.visaCodeGuarantee=data.content[0].visaCode;
                            $scope.codeName = data.content[0].visaCode+'-'+data.content[0].visaName;
                            $scope.proposal.visaSerisal = data.content[0].visaSerisal;
                        },
                        error: function (e) {
                            options.error(e);
                        }

                    });
                    $scope.configPrintSet();
                    $scope.policyNo = $scope.list[0].policyNo;
                    $scope.proposalNo = $scope.list[0].proposalNo;
                }

            }
            var initPage3 = function ($event) {
                $scope.paginationConfmm1 = {
                    currentPage: 1,//当前页
                    totalItems: 0,//总条数
                    itemsPerPage: 5,//每页条数
                    pagesLength: 5,//总页数
                    perPageOptions: [5, 10, 20, 50],
                    onChange:function() {
                        $scope.printlist = [];
                        for (var i = ($scope.paginationConfmm1.currentPage - 1) * $scope.paginationConfmm1.itemsPerPage; i <$scope.paginationConfmm1.currentPage * $scope.paginationConfmm1.itemsPerPage; i++) {
                            if($scope.list[i]){
                                $scope.printlist.push($scope.list[i]);
                            }

                        }
                    }

                };
                /*  //当前如果一页能显示出来，不展示分页、
                 if($scope.paginationConfmm.totalItems<=$scope.paginationConfmm.itemsPerPage){
                 $scope.paginationConfmm.totalItems=0;
                 }*/
            };
            initPage3();
            $scope.printListShow=false;
            $scope.showprintListShow= function () {
                $scope.printListShow=true;

            }
            $scope.showprintListHide= function () {
                $scope.printListShow=false;
            }
            //打印类型选择
            $scope.printType = 'PolicyPrint';//默认选择的打印类型
            $scope.choosePrintype = function (type) {
                $scope.printType = type;
                if(type=='PolicyPrint'){
                    $scope.policyDisabled=false
                }else{
                    $scope.policyDisabled=true
                }
            };
            //打印信息选择
            $scope.isActive = function(type) {
                var printType = $scope.printType == type ? true : false;
                return printType
            }

            $scope.tishi=function(x){
                layer.open({
                    /*offset: ['45%', '40%'],*/
                    skin: 'large-layer-content',
                    scrollbar: false,
                    closeBtn: 0,
                    title: '温馨提示',
                    content: cont,
                    btn: ['确定'],
                    btn1: function(index, layero){
                        //按钮【按钮一】的回调
                        layer.close(index);
                    }
                });
            }
            //查询校验  blur事假校验
            $scope.checkpolicyNo= function ($event,str) {
                //保单号码
                if(str){
                    var reg=/^\d+$/;
                    if(!reg.test(str)){
                        $scope.check.policyNo="保单号码格式错误，请修改！";
                        $event.target.focus();
                    }else if(str.length<15){
                        $scope.check.policyNo="保单号码需输入至少15位数！";
                        $event.target.focus();
                    }else{
                        $scope.check.policyNo="";
                    }
                }else{
                    $scope.check.policyNo="";
                }
            }
            $scope.checkappliName= function ($event,str) {
                //投保人名称
                var appliNameReg=/^[\u4E00-\u9FA50-9]+$/;
                if(str){
                    if(!appliNameReg.test(str)){
                        $scope.check.appliName="投保人名称格式错误，请修改！";
                        $event.target.focus();
                    }
                }else{
                    $scope.check.appliName=""
                }
            }
            $scope.checkappliCode= function ($event,str) {
                //投保人代码
                var appliCodeReg=/^[0-9a-zA-z]+$/;
                if(str&&!appliCodeReg.test(str)){
                    $scope.check.appliCode="投保人代码格式不正确，请修改！";
                    $event.target.focus();
                }else{
                    $scope.check.appliCode="";
                }
            }
            $scope.checkinsuredName= function ($event,str) {
                //被保险人名称
                var insuredNameReg=/^[\u4E00-\u9FA50-9]+$/;
                if(str&&!insuredNameReg.test(str)){
                    $scope.check.insuredName="被保险人名称格式错误，请修改！";
                    $event.target.focus();
                }else{
                    $scope.check.insuredName="";
                }
            }
            $scope.checkinsuredCode= function ($event,str) {
                //被保险人代码
                var insuredCodeReg=/^[0-9a-zA-z]+$/;
                if(str&&!insuredCodeReg.test(str)){
                    $scope.check.insuredCode="被保险人代码格式错误，请修改！";
                    $event.target.focus();
                }else{
                    $scope.check.insuredCode="";
                }
            }
            $scope.checkproposalNo= function ($event,str) {
                //投保单号码
                if(str){
                    var reg=/^\d+$/;
                    if(!reg.test(str)){
                        $scope.check.proposalNo="投保单号码格式错误，请修改！";
                        $event.target.focus();
                    }else if(str.length<15){
                        $scope.check.proposalNo="投保单号码需输入至少15位数！";
                        $event.target.focus();
                    }else{
                        $scope.check.proposalNo="";
                    }
                }else{
                    $scope.check.proposalNo="";
                }
            }
            $scope.checksumAmount= function ($event,str) {
                //总保险金额
                var sumAmountReg=/^[0-9]+([.]{1}[0-9]+){0,1}$/;
                if(str&&!sumAmountReg.test(str)){
                    $scope.check.sumAmount="总保险金额格式从错误，请修改！";
                    $event.target.focus();
                }else{
                    $scope.check.sumAmount="";
                }
            }
            $scope.checksumPremium= function ($event,str) {
                //总保险费
                var sumPremiumReg=/^[0-9]+([.]{1}[0-9]+){0,1}$/;
                if(str&&!sumPremiumReg.test(str)){
                    $scope.check.sumPremium="总保险费格式错误，请修改！";
                    $event.target.focus();
                }else{
                    $scope.check.sumPremium="";
                }
            }
            $scope.checkcomCode= function ($event,str) {
                //归属机构
                var comCodeReg=/(^[\u4E00-\u9FA5]+$)|(^[0-9]+$)/;
                if(str&&!comCodeReg.test(str)){
                    $scope.check.comCode="归属机构格式错误，请修改！";
                    $event.target.focus();
                }else{
                    $scope.check.comCode="";
                }
            }
            $scope.checkhandlerCode= function ($event,str) {
                //业务员代码
                var handlerCodeReg=/^[0-9a-zA-z]+$/;
                if(str&&!handlerCodeReg.test(str)){
                    $scope.check.handlerCode="业务员代码格式错误，请修改！";
                    $event.target.focus();
                }else{
                    $scope.check.handlerCode="";
                }
            }
            $scope.checkoperatorCode= function ($event,str) {
                //操作员代码
                var operatorCodeReg=/^[0-9a-zA-z]+$/;
                if(str&&!operatorCodeReg.test(str)){
                    $scope.check.operatorCode="操作员代码格式错误，请修改！";
                    $event.target.focus();
                }else{
                    $scope.check.operatorCode="";
                }
            }
            $scope.compareDate11=function(startDate,endDate){
                $scope.day1(startDate,endDate);
            }
            $scope.day1=function(startDate,endDate){
                var startDate = parseInt(startDate.replace(/-/g, ""), 10);
                var endDate = parseInt(endDate.replace(/-/g, ""), 10);
                if (startDate > endDate) {
                    var content;
                    content = '起保止期要大于起保起期';
                    $scope.proposal.prpTmain.startDate = $filter('date')(new Date().setDate('01'),'yyyy-MM-dd');//起保开始时间
                    $scope.proposal.prpTmain.startDateEnd = $filter('date')(new Date(),'yyyy-MM-dd');//起保开始时间
                    layer.open({
                        //offset: ['40%', '40%'],
                        skin: 'large-layer-content',
                        scrollbar: false,
                        closeBtn: 0,
                        title: '温馨提示',
                        content: content,
                        btn: ['确定'],
                        btn1: function (index, layero) {
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                }
            }
            $scope.compareDate33=function(startDate,endDate){
                $scope.day3(startDate,endDate);
            }
            $scope.day3=function(startDate,endDate){
                var startDate = parseInt(startDate.replace(/-/g, ""), 10);
                var endDate = parseInt(endDate.replace(/-/g, ""), 10);
                if (startDate > endDate) {
                    var content;
                    content = '终保止期要大于终保起期';
                    $scope.proposal.prpTmain.endDate=$scope.time.year+1+'-'+$scope.time.month+'-01';//起保开始时间
                    $scope.proposal.prpTmain.endStartDate = $scope.time.year+1+'-'+$scope.time.month+'-'+$scope.time.date;//起保开始时间
                    layer.open({
                        /*offset: ['45%', '40%'],*/
                        skin: 'large-layer-content',
                        scrollbar: false,
                        closeBtn: 0,
                        title: '温馨提示',
                        content: content,
                        btn: ['确定'],
                        btn1: function (index, layero) {
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                }
            }
            $scope.compareDate2=function(startDate,endDate){
                var content;
                if (endDate&&!startDate) {
                    content = '请输入制单起期！';
                    $scope.proposal.prpTmain.operateDateEnd = "";
                    layer.open({
                        /*offset: ['45%', '40%'],*/
                        skin: 'large-layer-content',
                        scrollbar: false,
                        closeBtn: 0,
                        title: '温馨提示',
                        content: content,
                        btn: ['确定'],
                        btn1: function(index, layero){
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                }else {
                    $scope.day2(startDate,endDate);
                }
            }
            $scope.compareDate22=function(startDate,endDate){
                $scope.day2(startDate,endDate);
            }
            $scope.day2=function(startDate,endDate){
                var startDate = parseInt(startDate.replace(/-/g, ""), 10);
                var endDate = parseInt(endDate.replace(/-/g, ""), 10);
                if (startDate > endDate) {
                    var content;
                    content = '制单止期要大于制单起期';
                    /*$scope.proposal.prpMmodelMainRequest.endDate = "";*/
                    $scope.proposal.prpTmain.operateDateStart = $filter('date')(new Date().setDate('01'),'yyyy-MM-dd');//制单开始日期
                    $scope.proposal.prpTmain.operateDateEnd = $filter('date')(new Date(),'yyyy-MM-dd');//制单截止日期
                    layer.open({
                        /*offset: ['45%', '40%'],*/
                        skin: 'large-layer-content',
                        scrollbar: false,
                        closeBtn: 0,
                        title: '温馨提示',
                        content: content,
                        btn: ['确定'],
                        btn1: function (index, layero) {
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                }
            }
            //分页设置
            var initPage2 = function () {
                $scope.paginationConfmm = {
                    currentPage: 1,//当前页
                    totalItems: 0,//总条数
                    itemsPerPage: 20,//每页条数
                    pagesLength: 5,//总页数
                    perPageOptions: [5, 10, 20, 50],
                    onChange:function(){//如果当前页有变动
                        if($scope.paginationConfmm.totalItems==0){//如果没有进行查询，不执行
                            return;
                        }else {
                            $scope.proposal.prpTmain.pageNo = $scope.paginationConfmm.currentPage;
                            $scope.proposal.prpTmain.pageSize = $scope.paginationConfmm.itemsPerPage;
                            $scope.proposal.prpTmain.queryFlag='1'
                            var dto = angular.copy($scope.proposal.prpTmain);
                            $$finder.find('queryPolicyListByConditon', dto, {
                                success: function (data) {
                                    var list = data.content.content;
                                    angular.forEach(list, function (_data) {
                                        var strOthFlag = _data.othFlag;
                                        if(strOthFlag.substr(3,1)!='2'){
                                            if ( _data.underWriteFlag == '0' && strOthFlag.substr(0,1) == "0") {
                                                _data.othFlag = "普通新保"
                                            }else if( _data.underWriteFlag == '0' && strOthFlag.substr(0,1) == "1"){
                                                _data.othFlag = "续保新保"
                                            }else if( _data.underWriteFlag == '1'){
                                                _data.othFlag = "核保通过"
                                            }else if( _data.underWriteFlag == '2' && strOthFlag.substr(3,1) != "3"){
                                                _data.othFlag = "核保打回"
                                            }else if( _data.underWriteFlag == '2' && strOthFlag.substr(3,1) == "3"){
                                                _data.othFlag = "拒保"
                                            }else if( _data.underWriteFlag == '3'){
                                                _data.othFlag = "自动核保"
                                            }else if( _data.underWriteFlag == '9'){
                                                _data.othFlag = "待核保"
                                            }else if(_data.underWriteFlag == '4'){
                                                _data.othFlag = "见费出单没收费"
                                            }
                                        }
                                        if (strOthFlag.substr(3, 1) == "2") {
                                            _data.othFlag = "已撤单"
                                        }
                                        if (strOthFlag.substr(3, 1) == "1") {
                                            _data.othFlag = "已注销";
                                        }
                                        else if (strOthFlag.substr(2, 1) == "1") {
                                            _data.othFlag = "全单退保";
                                        }
                                        if (strOthFlag.substr(4, 1) == "1") {
                                            _data.othFlag = "已遗失";
                                        }
                                        if (strOthFlag.substr(4, 1) == "1") {
                                            _data.othFlag = "已遗失";
                                        }

                                    })
                                    $scope.proposal.QueryList = list;
                                    $scope.totalItems = data.content.totalCount;
                                    //查询结果条数
                                    $scope.paginationConfmm.totalItems = $scope.totalItems;
                                },
                                error: function (e) {
                                    options.error(e);
                                }
                            });
                        }
                    }

                };
                /*  //当前如果一页能显示出来，不展示分页、
                  if($scope.paginationConfmm.totalItems<=$scope.paginationConfmm.itemsPerPage){
                      $scope.paginationConfmm.totalItems=0;
                  }*/
            };
            initPage2();
            //核保详情查询
            $scope.policyInfo = false;
            $scope.getViewTrace = function (x) {
                $$finder.find('getUndwrtTrackResponsData', {//getViewTrace这个是国元的
                    "businessNo": x//proposalNo同上
                }, {
                    success: function (data) {
                        $scope.examineList = data.content;
                        if($scope.examineList) {
                            $scope.policyInfo = true;
                        }
                    },
                    error: function (e) {
                        options.error(e);
                    }
                });
            }
            //关闭详情
            $scope.closepolicyInfoShow = function () {
                $scope.policyInfo = false;
            }
            //撤单
            $scope.revocation = function(x){
                $$finder.find('withdrawProposalnoSubmit', x, {
                    success: function (data) {
                        console.log(data)
                    },
                    error: function (e) {
                        options.error(e);
                    }
                });
            }
            //全选
            $scope.checked = [];
            $scope.selectAll = function() {
                if($scope.select_all) {
                    $scope.checked = [];
                    angular.forEach($scope.guarantee, function(x) {
                        x.checked = true;
                        $scope.checked.push(x.policyNo);
                    })
                } else {
                    angular.forEach($scope.guarantee, function(x) {
                        x.checked = false;
                        $scope.checked = [];
                    })
                }
            };
            //单选
            $scope.selectOne = function() {
                angular.forEach($scope.guarantee, function(x) {
                    var index = $scope.checked.indexOf(x.policyNo);
                    if(x.checked && index === -1) { //如果被选中，且不再选中的集合中
                        $scope.checked.push(x.policyNo); //把东西存进选中的集合中
                    } else if(!x.checked && index !== -1) { //如果存在就进行删除
                        $scope.checked.splice(index, 1);
                    };
                });
                if($scope.guarantee.length === $scope.checked.length) {
                    $scope.select_all = true;
                } else {
                    $scope.select_all = false;
                }

            }
            //获取投保单信息
            $scope.QueryList=function(){}
            //展开更多查询条件
            $scope.conditionShow=false;
            $scope.tabBtn = true;
            $scope.addFrom=function(){
                $scope.tabBtn = !$scope.tabBtn;
                $scope.conditionShow=!$scope.conditionShow;
            };
            //重置表单
            $scope.reset=function(){
                $scope.proposal.prpTmain = {};
                //$scope.proposal.prpTmain.startDate = $scope.time.year+'-'+$scope.time.month+'-01';//起保开始时间
                //$scope.proposal.prpTmain.startDateEnd = $scope.time.year+'-'+$scope.time.month+'-'+$scope.time.date;//起保开始时间
                //$scope.proposal.prpTmain.endDate = $scope.time.year+1+'-'+$scope.time.month+'-01';//终保时间
                //$scope.proposal.prpTmain.endStartDate =$scope.time.year+1+'-'+$scope.time.month+'-'+$scope.time.date;//终保时间间
                //$scope.proposal.prpTmain.operateDateStart =  $scope.time.year+'-'+$scope.time.month+'-01';//制单开始日期
                //$scope.proposal.prpTmain.operateDateEnd = $scope.time.year+'-'+$scope.time.month+'-'+$scope.time.date;//制单截止日期
                $scope.proposal.prpTmain.printFlag='0';
                //$scope.proposal.prpTmain.BusinessType1='01';
                /*$scope.proposal.prpTmain.underWriteFlag = $scope.proposal.prpTmain.underWriteFlag;
                $scope.proposal.prpTmain.BusinessType1 = $scope.proposal.prpTmain.BusinessType1;*/
                $scope.paginationConfmm.totalItems=""
                $scope.proposal.QueryList ={}
            }
            //总保险金额的数字校验
            $scope.pressDecimal=function($event){
                if(($event.keyCode>=48 && $event.keyCode<=57) || $event.keyCode==46){
                    return true;
                }else{
                    $event.preventDefault();
                }
            }
     //输入保单号时清空默认日期查询，不输入时自动添加默认时间
      $scope.changPolicyNo=function(PolicyNo){
         if($scope.proposal.prpTmain.proposalNo||$scope.proposal.prpTmain.policyNo)
         {
             $scope.proposal.prpTmain.startDate = '';//起保开始时间
             $scope.proposal.prpTmain.startDateEnd = '';//起保开始时间
             $scope.proposal.prpTmain.endDate ='';//终保时间
             $scope.proposal.prpTmain.endStartDate = '';//终保时间间
             $scope.proposal.prpTmain.operateDateStart ='';//制单开始日期
             $scope.proposal.prpTmain.operateDateEnd ='';//制单截止日期
         }else{
             $scope.proposal.prpTmain.startDate=$scope.time.year+'-'+$scope.time.month+'-01';
             $scope.proposal.prpTmain.startDateEnd=$scope.time.year+'-'+$scope.time.month+'-'+$scope.time.date;
             $scope.proposal.prpTmain.endDate=$scope.time.year+1+'-'+$scope.time.month+'-01';
             $scope.proposal.prpTmain.endStartDate=$scope.time.year+1+'-'+$scope.time.month+'-'+$scope.time.date;
             $scope.proposal.prpTmain.operateDateStart=$scope.time.year+'-'+$scope.time.month+'-01';
             $scope.proposal.prpTmain.operateDateEnd=$scope.time.year+'-'+$scope.time.month+'-'+$scope.time.date;
         }
      }
            //全选
            $scope.checked1 = [];
            $scope.selectAll=function(){
                if($scope.select_all){
                    $scope.checked1 = [];
                    angular.forEach($scope.proposal.QueryList,function(info){
                        info.checked=true;
                        $scope.checked1.push (info.id);
                    })
                } else {
                    angular.forEach($scope.proposal.QueryList,function(info){
                        info.checked=false;
                        $scope.checked1 = [];
                    })
                }
            }
            //单选，反选
            $scope.selectOne=function(){
                angular.forEach($scope.proposal.QueryList , function (info) {
                    var index = $scope.checked1.indexOf(info.id);
                    if(info.checked && index === -1) {
                        $scope.checked1.push(info.id);
                    } else if (!info.checked && index !== -1){
                        $scope.checked1.splice(index, 1);
                    };
                });
                if($scope.proposal.QueryList.length==$scope.checked1.length){
                    $scope.select_all=true;
                }else {
                    $scope.select_all=false;
                }
            }
            //投保单查询页面的查看与修改
            $scope.revise=function(type){
                $("html,body").css({overflow:"auto"});//出现滚动条
                $state.go('UIproposal3107edit',{type:type})
            }
            //    创建日期初始化
            $scope.nowDate=new Date();
            $scope.time={
                year:$scope.nowDate.getFullYear(),
                month:(function () {
                    var month=$scope.nowDate.getMonth()+1;
                    return month>=10?month:"0"+month
                })(),
                date:(function(){
                    var date=$scope.nowDate.getDate();
                    return date>=10?date:"0"+date
                })()
            }
            $scope.printUpload=function(){
                var dto=angular.copy( $scope.proposal.QueryList);
                var list=[];
                var listFile=[];
                var layerflag=false;
                var isSelect=0;
                angular.forEach($scope.proposal.QueryList,function(dto){
                    if(dto.checked){
                        isSelect=1;
                        if((dto.underWriteFlag=='1'||dto.underWriteFlag=='3')&&(dto.othFlag != "已注销")){
                            list.push(dto.policyNo);
                            listFile.push(dto.printNo)
                        }else{
                            layerflag=true;
                            dto.checked=false;
                        }
                    }
                });

                //校验保单号
                if(isSelect==0){//请选择保单号
                    layer.open({
                        //offset: ['38%', '40%'],
                        skin: 'large-layer-content',
                        scrollbar: false,
                        closeBtn: 0,
                        title: '温馨提示',
                        content: '请选择保单号!',
                        btn: ['确定'],
                        btn1: function(index, layero){
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                }else if(list.length<=0){
                    layer.open({
                        //offset: ['47%', '31%'],
                        skin: 'large-layer-content',
                        scrollbar: false,
                        closeBtn: 0,
                        title: '温馨提示',
                        content: '未收费或未核保的保单不可下载!',
                        btn: ['确定'],
                        btn1: function(index, layero){
                            //按钮【按钮一】的回调
                            layer.close(index);
                        }
                    });
                }else if(list.length>0&&layerflag){
                    layer.open({
                        //offset: ['47%', '31%'],
                        skin: 'large-layer-content',
                        scrollbar: false,
                        closeBtn: 0,
                        title: '温馨提示',
                        content: '已剔除未收费或未核保的保单,是否继续下载!',
                        btn: ['确定','取消'],
                        btn1: function(index5, layero){
                            //按钮【按钮一】的回调
                            layer.close(index5);
                            //判断保单如果已经正本打印，就不能再次下载
                            $$finder.find('policyPrintStatus',{
                                "policyNos":list
                            },{
                                success:function(data){
                                    $scope.policyPrintList=data.content.policyPrintList;
                                    $scope.policyPrintUploadList=data.content.policyPrintUploadList;
                                    $scope.policyPrintNo=data.content.policyPrintNo;
                                    //后端传值处理
                                    var print = '';
                                    var printFile = '';
                                    var endpolicyNo = '';//保单号
                                    var fileIds=''
                                    var listPolicy=[];
                                    var listPolicyFile=[];
                                    for(i in $scope.policyPrintUploadList){
                                        listPolicyFile.push($scope.policyPrintUploadList[i])
                                        listPolicy.push(i);
                                    }
                                    var list1=listPolicy.concat($scope.policyPrintNo);
                                    for (var i = 0; i <  list1.length; i++) {
                                        if (i == 0) {
                                            print = 'policyNo=' + list1[i];
                                        } else {
                                            print = '&policyNo=' + list1[i];
                                        }
                                        //保单号
                                        endpolicyNo = endpolicyNo + print
                                    }
                                    for (var i = 0; i < listPolicyFile.length; i++) {
                                        if (i == 0) {
                                            printFile='fileIds='+ listPolicyFile[i]
                                        } else {
                                            printFile='&fileIds='+ listPolicyFile[i]
                                        }
                                        //保单号
                                        fileIds=fileIds+printFile
                                    }
                                    if($scope.policyPrintNo.length>0){//未打印传0
                                        for (var i = 0; i < $scope.policyPrintNo.length; i++) {
                                            var ids
                                            if (i == 0) {
                                                ids = 'fileIds=0'
                                            } else {
                                                ids = '&fileIds=0'
                                            }
                                            fileIds = fileIds + ids
                                        }
                                    }
                                    if($scope.policyPrintList.length>0){
                                        //已正本打印的保单剔除勾选
                                        angular.forEach($scope.proposal.QueryList,function(dto){
                                            if(dto.checked&&($.inArray(dto.policyNo,$scope.policyPrintList)>-1)){
                                                dto.checked=false;
                                            }
                                        });
                                        if(listPolicy.length==0&&$scope.policyPrintNo.length==0){
                                            layer.open({
                                                skin: 'large-layer-content',
                                                scrollbar: false,
                                                closeBtn: 0,
                                                title: '温馨提示',
                                                content: '已正本打印的保单不能下载电子保单!',
                                                btn: ['确定'],
                                                btn1: function(index, layero){
                                                    //按钮【按钮一】的回调
                                                    layer.close(index);
                                                }
                                            });
                                        }else if(listPolicy.length>0||$scope.policyPrintNo.length>0){
                                            layer.open({
                                                skin: 'large-layer-content',
                                                scrollbar: false,
                                                closeBtn: 0,
                                                title: '温馨提示',
                                                content: '已剔除正本打印的保单,是否继续下载?',
                                                btn: ['确定', '取消'],
                                                btn1: function(index5, layero){
                                                    //按钮【按钮一】的回调
                                                    layer.close(index5);
                                                    $window.open('/api/agriprpall/print/policyDownLoad?' + endpolicyNo + '&' + fileIds)
                                                },
                                                btn2: function (index1, layero) {
                                                    //按钮【按钮一】的回调
                                                    layer.close(index1);
                                                }
                                            });
                                        }

                                    }else {
                                        $window.open('/api/agriprpall/print/policyDownLoad?' + endpolicyNo + '&' + fileIds)
                                    }
                                },
                                error:function(e){
                                    options.error(e);
                                }
                            });
                        },
                        btn2: function (index1, layero) {
                            //按钮【按钮一】的回调
                            layer.close(index1);
                        }
                    });
                }else{
                    //判断保单如果已经正本打印，就不能再次下载
                    $$finder.find('policyPrintStatus',{
                        "policyNos":list
                    },{
                        success:function(data){
                            $scope.policyPrintList=data.content.policyPrintList;
                            $scope.policyPrintUploadList=data.content.policyPrintUploadList;
                            $scope.policyPrintNo=data.content.policyPrintNo;

                            //后端传值处理
                            var print = '';
                            var printFile = '';
                            var endpolicyNo = '';//保单号
                            var fileIds=''
                            var listPolicy=[];
                            var listPolicyFile=[];
                            for(i in $scope.policyPrintUploadList){
                                listPolicyFile.push($scope.policyPrintUploadList[i])
                                listPolicy.push(i);
                            }
                            var list1=listPolicy.concat($scope.policyPrintNo);
                            for (var i = 0; i <  list1.length; i++) {
                                if (i == 0) {
                                    print = 'policyNo=' + list1[i];
                                } else {
                                    print = '&policyNo=' + list1[i];
                                }
                                //保单号
                                endpolicyNo = endpolicyNo + print
                            }
                            for (var i = 0; i < listPolicyFile.length; i++) {
                                if (i == 0) {
                                    printFile='fileIds='+ listPolicyFile[i]
                                } else {
                                    printFile='&fileIds='+ listPolicyFile[i]
                                }
                                //保单号
                                fileIds=fileIds+printFile
                            }
                            if($scope.policyPrintNo.length>0){//未打印传0
                                for (var i = 0; i < $scope.policyPrintNo.length; i++) {
                                    var ids
                                    if (i == 0) {
                                        ids = 'fileIds=0'
                                    } else {
                                        ids = '&fileIds=0'
                                    }
                                    fileIds = fileIds + ids
                                }
                            }
                            if($scope.policyPrintList.length>0){
                                //已正本打印的保单剔除勾选
                                angular.forEach($scope.proposal.QueryList,function(dto){
                                    if(dto.checked&&($.inArray(dto.policyNo,$scope.policyPrintList)>-1)){
                                        dto.checked=false;
                                    }
                                });
                                if(listPolicy.length==0&&$scope.policyPrintNo.length==0){
                                    layer.open({
                                        skin: 'large-layer-content',
                                        scrollbar: false,
                                        closeBtn: 0,
                                        title: '温馨提示',
                                        content: '已正本打印的保单不能下载电子保单!',
                                        btn: ['确定'],
                                        btn1: function(index, layero){
                                            //按钮【按钮一】的回调
                                            layer.close(index);
                                        }
                                    });
                                }else if(listPolicy.length>0||$scope.policyPrintNo.length>0){
                                    layer.open({
                                        skin: 'large-layer-content',
                                        scrollbar: false,
                                        closeBtn: 0,
                                        title: '温馨提示',
                                        content: '已剔除正本打印的保单,是否继续下载?',
                                        btn: ['确定', '取消'],
                                        btn1: function(index5, layero){
                                            //按钮【按钮一】的回调
                                            layer.close(index5);
                                            $window.open('/api/agriprpall/print/policyDownLoad?' + endpolicyNo + '&' + fileIds)
                                        },
                                        btn2: function (index1, layero) {
                                            //按钮【按钮一】的回调
                                            layer.close(index1);
                                        }
                                    });
                                }

                            }else {
                                $window.open('/api/agriprpall/print/policyDownLoad?' + endpolicyNo + '&' + fileIds)
                            }
                        },
                        error:function(e){
                            options.error(e);
                        }
                    });

                }

            }
            //隐藏险种方案
            //$scope.showRiskScheme=false;
            //$scope.riskNameHide=false;
        }]);
});