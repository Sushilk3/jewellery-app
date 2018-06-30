var app = angular.module('stockApp', []);
app.controller('stockCtrl', function($scope,$http,$window) {
   
	
	 $http.get("/goldshopping/stock/list", {
	    }).then(function (response) {
	            
	    	$scope.stockList=response.data;
	    	
	    	
	    })
	 
	 
	
	
});