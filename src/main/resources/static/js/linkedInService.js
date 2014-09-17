var LinkedInService = function($scope, RestFactory) {

	/************************************************************************
	 ************************************************************************/
	var service = {
	
		expandMyShortUrlPlease : function(shortUrl, mode)
		{
			if(mode === 'Java')
			{
				RestFactory.expandUrlFromJava({url:shortUrl}, urlExpandedSuccessfully, urlExpandedError);
			}
			else
			{
				RestFactory.expandUrlFromJavascript({url:shortUrl}, urlExpandedSuccessfully, urlExpandedError);				
			}
		}
	
	}
		

	/************************************************************************
	 * 							  PRIVATE METHODS							*
	 ************************************************************************/
	
	function urlExpandedSuccessfully(response) 
	{
		$scope.$broadcast('url.expanded', response);
    }
	
	function urlExpandedError(response) 
	{
		$scope.$broadcast('url.expanded', "Error expanding URL. Please, try again.");
    }
		
	return service;
};