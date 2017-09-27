app.controller('HomeController', function($scope, $http) {
    $scope.headingTitle = "User List";

    $http.get("http://localhost:8080/api/users").then(function(response) {
        $scope.users = response.data;
    });
});