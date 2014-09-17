var RestFactory = function ($resource) {
	
	return $resource('/urls',{url: '@url'},{
		expandUrlFromJava:
		{
            method: 'GET',
			responseType:'json',
			isArray: false
        },
		expandUrlFromJavascript:
		{
			url: 'http://expandurl.appspot.com/expand',
	        method: 'GET',
			responseType:'json',
			isArray: false			
		}
    });
};