var app = angular.module('app', ['ngRoute','ngResource']);

app.config(function($routeProvider) {
    $routeProvider
        .when('/home', {
            templateUrl: '/views/home.html',
            controller: 'HomeController',
            controllerAs: 'vm'
        })
        .when('/login', {
            templateUrl: '/views/login.html',
            controller: 'LoginController',
            controllerAs: 'vm'
        })
        .otherwise(
            { redirectTo: '/home' }
        );
});

app.directive('header', headerDirective);