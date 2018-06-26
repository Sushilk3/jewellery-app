var app = angular.module('loginApp', []);
app.controller('loginCtrl', function($scope,$http) {
   
	
	$scope.login=function(data)
	{
		
		 $http({
		    	url: "/goldshopping/login",
		    	method: 'POST',
		    	headers: { 'Content-Type':'application/json'},
		    	data: JSON.stringify(data)
		    	}).success(function(data,status) { 
		    	
		    		alert(JSON.stringify(data));
		    		
		        });
		
	}
	
	
	 
	 
	
	
});