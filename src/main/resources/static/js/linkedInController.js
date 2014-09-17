var LinkedInController = function($scope, LinkedInService) {
	
	$scope.modes = ['Java', 'Javascript']
	 
	$scope.$on( 'url.expanded', function(event, response) {
		$scope.longUrl = response.longUrl;
	});
	
	$scope.expandMyShortUrlPlease = function()
	{
		LinkedInService.expandMyShortUrlPlease($scope.shortUrl, $scope.mode);
	};
	
};