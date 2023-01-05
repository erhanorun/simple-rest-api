# Simple Rest API

## Installation

First and foremost `PostgreSQL` should be installed on your local machine.
The following `Java Spring` application bootstrap.

## Initialize DB

I utilised PostgreSQL for as a database for this project.
The project looks for the database on `http://localhost:5432`.


Sample Requests can be found under src/main/resources and can be imported into Postman.

## API Documentation

* [Post customer](/api.md): `Post /api/customers`
* [Get customer](/api.md) : `GET /api/customers`
* [Get customers](/api.md) : `GET /api/All customers`
* [Search](/api.md) : `GET /search`

* [Post order](/api.md): `Post /api/orders`
* [Get order](/api.md) : `GET /api/orders`
* [Get orders](/api.md) : `GET /api/All orders`

## Purpose
My purpose is to create a simple REST api for customer and order creation and listing.
There is a one to many relationship between the customer and its orders.
In addition, search endpoint has been added. This endpoint provides filtering capacity for customer name and age.
The application is running on `http://localhost:8080`.
You can test the api with `Postman` according to the above documentation.

You can find the Postman link [here](https://www.getpostman.com/collections/3d00cd258663510c195e).
