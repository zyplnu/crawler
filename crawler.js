//var url='https://detail.tmall.com/item.htm?spm=a222t.7794920.fdigt.15.toj3Lg&id=522169321891&rn=870e70c02239d3cf10b156e9f9aa9e4f&scm=search-api.3c_fp.870e70c02239d3cf10b156e9f9aa9e4f.2&sku_properties=20105:41420';
var url = 'https://item.jd.com/6138112.html?extension_id=eyJhZCI6IjE3NTUiLCJjaCI6IjIiLCJza3UiOiI2MTM4MTEyIiwidHMiOiIxNTU1NDc2NzcwIiwidW5pcWlkIjoie1wiY2xpY2tfaWRcIjpcImMzN2JkMDA1LTQ4MDctNDg5Yi04MmNiLTExZTliNjJiN2JjOFwiLFwibWF0ZXJpYWxfaWRcIjpcIjg5NTQ2MjgwMjYzNTQ5MDU4NjRcIixcInBvc19pZFwiOlwiMTc1NVwiLFwic2lkXCI6XCIzZGFjNWRmYS01ZTM2LTRkMTMtYjRlNy0wMzZkNGVlODEwNGZcIn0ifQ==&jd_pop=c37bd005-4807-489b-82cb-11e9b62b7bc8&abt=0#comment';
//var url = 'https://product.suning.com/0000000000/10973073783.html?srcpoint=dacu_sjxinpin_118300821005_prod01&safp=d488778a.sjxinpin.0.362491579b&safc=prd.0.0';
phantom.outputEncoding="gbk";
var page = require('webpage').create();

page.settings.userAgent= 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:64.0) Gecko/20100101 Firefox/64.0';

//Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:64.0) Gecko/20100101 Firefox/64.0

page.open(url,function (status) {
    if (status !== 'success') {
        console.log('Unable to access thewebsite');
    } else {
        console.log(status);
        var val = page.evaluate(function(){
            //return document.querySelector('span.tm-price').innerHTML;
             return document.querySelector('p.comment-con').innerHTML;
            //return document.querySelector('.body-content').innerHTML;
            //return document.getElementsByClassName("tm-price").textContent;
        });
        console.log(val);
    };
    phantom.exit();
});
    https://sclub.jd.com/comment/productPageComments.action?callback=fetchJSON_comment98vv15&productId=6138112&score=0&sortType=5&page=0&pageSize=10&isShadowSku=0&fold=1
    https://sclub.jd.com/comment/productPageComments.action?callback=fetchJSON_comment98vv15&productId=6138112&score=0&sortType=5&page=1&pageSize=10&isShadowSku=0&rid=0&fold=1
    https://sclub.jd.com/comment/productPageComments.action?callback=fetchJSON_comment98vv15&productId=6138112&score=0&sortType=5&page=2&pageSize=10&isShadowSku=0&fold=1