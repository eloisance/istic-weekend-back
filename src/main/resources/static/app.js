var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/home',{
            templateUrl: '/views/home.html',
            controller: 'HomeController'
        })
        .when('/login',{
            templateUrl: '/views/login.html',
            controller: 'LoginController'
        })
        .otherwise(
            { redirectTo: '/home'}
        );
});