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

**URL** : `/api/customer`

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



# Customer

Get a user  by `customer_id`.

**URL** : `/api/customer/:customer_id`

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

**URL** : `/api/customer/:customer_id`

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

Post order with `name`.

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
