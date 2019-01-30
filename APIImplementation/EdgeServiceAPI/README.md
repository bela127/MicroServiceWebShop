# APIService

API Service
- API version: 1.0.0
  - Build date: 2019-01-03T22:27:11.419Z

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>APIService</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:APIService:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/APIService-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import hska.microServiceWebShop.*;
import hska.microServiceWebShop.auth.*;
import hska.microServiceWebShop.models.*;
import hska.microServiceWebShop.api.CategoriesApi;

import java.io.File;
import java.util.*;

public class CategoriesApiExample {

    public static void main(String[] args) {
        
        CategoriesApi apiInstance = new CategoriesApi();
        Category name = new Category(); // Category | The name of the category
        try {
            Category result = apiInstance.addCategory(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoriesApi#addCategory");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CategoriesApi* | [**addCategory**](docs/CategoriesApi.md#addCategory) | **POST** /categories | Adds a new category
*CategoriesApi* | [**deleteCategory**](docs/CategoriesApi.md#deleteCategory) | **DELETE** /categories/{id} | Deletes a category
*CategoriesApi* | [**getCategory**](docs/CategoriesApi.md#getCategory) | **GET** /categories/{id} | Retrieves a category
*CategoriesApi* | [**queryCategories**](docs/CategoriesApi.md#queryCategories) | **GET** /categories | Queries categories. If no name is provided all categories will be returned
*ProductsApi* | [**addProduct**](docs/ProductsApi.md#addProduct) | **POST** /products | Adds a new product
*ProductsApi* | [**deleteProduct**](docs/ProductsApi.md#deleteProduct) | **DELETE** /products/{id} | Deletes a product
*ProductsApi* | [**getProduct**](docs/ProductsApi.md#getProduct) | **GET** /products/{id} | Retrieves a product
*ProductsApi* | [**queryProducts**](docs/ProductsApi.md#queryProducts) | **GET** /products | Queries products. If no parameters is provided all products will be returned
*UserRoleApi* | [**createRole**](docs/UserRoleApi.md#createRole) | **POST** /roles | Create role
*UserRoleApi* | [**createUser**](docs/UserRoleApi.md#createUser) | **POST** /users | Create user
*UserRoleApi* | [**deleteRole**](docs/UserRoleApi.md#deleteRole) | **DELETE** /roles/{id} | Delete role with Id
*UserRoleApi* | [**deleteUser**](docs/UserRoleApi.md#deleteUser) | **DELETE** /users/{id} | Delete user with Id
*UserRoleApi* | [**getRoleById**](docs/UserRoleApi.md#getRoleById) | **GET** /roles/{id} | Get role by Id
*UserRoleApi* | [**getRoles**](docs/UserRoleApi.md#getRoles) | **GET** /roles | Get roles
*UserRoleApi* | [**getUserById**](docs/UserRoleApi.md#getUserById) | **GET** /users/{id} | Get user by Id
*UserRoleApi* | [**getUsers**](docs/UserRoleApi.md#getUsers) | **GET** /users | Get users


## Documentation for Models

 - [Category](docs/Category.md)
 - [CategoryQuery](docs/CategoryQuery.md)
 - [Error](docs/Error.md)
 - [Product](docs/Product.md)
 - [ProductQuery](docs/ProductQuery.md)
 - [Role](docs/Role.md)
 - [RoleQuery](docs/RoleQuery.md)
 - [User](docs/User.md)
 - [UserQuery](docs/UserQuery.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

bhb127@outlook.de
