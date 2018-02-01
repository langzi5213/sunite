
var exec = require('cordova/exec');

var ezviz = {
  start:function (successCallback,errorCallback,monitorArr){
    exec(successCallback,errorCallback,"EzvizVideo","start",[monitorArr]);
  },
   up:function (successCallback,errorCallback,monitorArr){
    exec(successCallback,errorCallback,"EzvizVideo","up",[monitorArr]);
  },
   bottom:function (successCallback,errorCallback,monitorArr){
    exec(successCallback,errorCallback,"EzvizVideo","bottom",[monitorArr]);
  },
   left:function (successCallback,errorCallback,monitorArr){
    exec(successCallback,errorCallback,"EzvizVideo","left",[monitorArr]);
  },
   right:function (successCallback,errorCallback,monitorArr){
    exec(successCallback,errorCallback,"EzvizVideo","right",[monitorArr]);
  },
  up_stop:function (successCallback,errorCallback,monitorArr){
    exec(successCallback,errorCallback,"EzvizVideo","up_stop",[monitorArr]);
  },
   bottom_stop:function (successCallback,errorCallback,monitorArr){
    exec(successCallback,errorCallback,"EzvizVideo","bottom_stop",[monitorArr]);
  },
   left_stop:function (successCallback,errorCallback,monitorArr){
    exec(successCallback,errorCallback,"EzvizVideo","left_stop",[monitorArr]);
  },
   right_stop:function (successCallback,errorCallback,monitorArr){
    exec(successCallback,errorCallback,"EzvizVideo","right_stop",[monitorArr]);
  },
};

module.exports = ezviz;
 

