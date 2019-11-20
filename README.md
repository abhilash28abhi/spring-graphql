# spring-graphql
Spring boot project demonstrating GraphQL capabilities

To access h2-console use:
1.  http://localhost:8080/h2/

To access GraphQl query UI tool:
1.  http://localhost:8080/graphiql

To fetch the product details for a given product Id , the GraphQl query would be:
```
{
  product(id: "1") {
    id
    title
    shortDesc
    listPrice
    reviews {
      reviewTitle
      reviewText
    }
  }
}
```

To Access only selected fields from the product pass the field names accordingly in the query:
```
{
  product(id: "1") {
    id
    title
    shortDesc
    listPrice
  }
}
```
