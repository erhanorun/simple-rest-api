# Create Customer

Post user with `customer_name`.

**URL** : `/api/customers`

**Method** : `POST`

**Auth required** : `No`

**Permissions required** : `None`

**Headers** :
```json
{
    "Content-Type": "application/json"
}
```

## Success Response

**Code** : `200 OK`

# Customers

User listing page.

**URL** : `/api/customers`

**Method** : `GET`

**Auth required** : `No`

**Permissions required** : `None`

**Headers** :
```json
{
  "Content-Type": "application/json"
}
```

## Success Response

**Code** : `200 OK`



# Customers by ID

Get a user  by `customer_id`.

**URL** : `/api/customers/:customer_id`

**Method** : `GET`

**Auth required** : `No`

**Permissions required** : `None`

**Headers** :
```json
{
  "Content-Type": "application/json"
}
```

## Success Response

**Code** : `200 OK`


# Search Customer

Filter a customer by `name` or `age`.

**URL** : `/api/customers/:customer_id`

**Method** : `GET`

**Auth required** : `No`

**Permissions required** : `None`

**Headers** :
```json
{
  "Content-Type": "application/json"
}
```

## Success Response

**Code** : `200 OK`



# Create Order

Post order with `order_name`.

**URL** : `/api/orders`

**Method** : `POST`

**Auth required** : `No`

**Permissions required** : `None`

**Headers** :
```json
{
    "Content-Type": "application/json"
}
```

## Success Response

**Code** : `200 OK`


# Orders

Post order with `orders`.

**URL** : `/api/orders`

**Method** : `GET`

**Auth required** : `No`

**Permissions required** : `None`

**Headers** :
```json
{
    "Content-Type": "application/json"
}
```

## Success Response

**Code** : `200 OK`


# Orders by ID

Get a user  by `order_id`.

**URL** : `/api/orders/:order_id`

**Method** : `GET`

**Auth required** : `No`

**Permissions required** : `None`

**Headers** :
```json
{
  "Content-Type": "application/json"
}
```

## Success Response

**Code** : `200 OK`
