(function(){
	angular.module('relevante.module', ['ngResource']);
})();

(function(){   
	"use strict";	
	angular.module('relevante.module')
		.factory('RestFactory', ['$resource', RestFactory])
		.service('LinkedInService', ['$rootScope','RestFactory', LinkedInService])
		.controller('LinkedInController', ['$scope','LinkedInService', LinkedInController]);
	
})();