var app = angular.module('loginApp', []);
app.controller('loginCtrl', function($scope,$http,$window) {
   
	
	$scope.login=function(data)
	{
		 $http({
		    	url: "/goldshopping/login",
		    	method: 'POST',
		    	headers: { 'Content-Type':'application/json'},
		    	data: JSON.stringify(data)
		    	}).success(function(data,status) { 
		    	
		    			if (typeof data.userFullName != 'undefined')
		    				{
				    		alert('Spring app - You are successfully logged in');
		    				$window.location.href = '/goldshopping/dashboard';
		    				}else{
		    					alert("Spring app - Invalid email or password.");
		    				}
		        });
		
	}
	
	
	 
	 
	
	
});