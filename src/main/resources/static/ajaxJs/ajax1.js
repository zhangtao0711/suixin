function doAjaxGet(url,param,callback){
	// console.log("---------------");
	var xhr=new XMLHttpRequest();
	xhr.onreadystatechange=function(){
	    if(xhr.readyState==4&&xhr.status==200){
	        callback(xhr.responseText);
	}
	};
	xhr.open("GET",url+"?"+param,true);
	xhr.send(null);
}
//封装ajax Post请求方式
function doAjaxPost(url,params,callback){
  //创建XMLHttpRequest对象，基于此对象发送请求
  var xhr=new XMLHttpRequest();
  //设置状态监听(监听客户端与服务端通讯的状态)
  xhr.onreadystatechange=function(){//回调函数，事件处理函数
      if(xhr.readyState==4&&xhr.status==200){
         //console.log(xhr.responseText);
         callback(xhr.responseText);//jsonStr
      }
  };
  //建立连接(请求方式为POST,请求url,异步还是同步-true表示异步)
  xhr.open("POST",url,true);
  //post请求传参时必须设置此请求头
  xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
  //发送请求
  console.log(params);
  xhr.send(params);//post请求send方法中传递参数
}