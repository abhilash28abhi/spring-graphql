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
2.  We can also pass the GraphQl query in encoded format and be used in controller for a given use-case:
http://localhost:8080/graphql?query=%7Bproduct%28id%3A%221%22%29%7BidtitleshortDesclistPrice%7D%7D which is human equivalent for
http://localhost:8080/graphql?query={product(id:"1"){idtitleshortDesclistPrice}}
