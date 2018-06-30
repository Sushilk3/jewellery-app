var app = angular.module('stockPurchaseApp', []);
app.controller('stockPurchaseCtrl', function($scope,$http,$window) {
   
	
	 $http.get("/goldshopping/stockPurchaseDetails/list", {
	    }).then(function (response) {
	            
	    	$scope.stockPurchaseList=response.data;
	    	
	    	
	    })
	 
	 
	
	
});