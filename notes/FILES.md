Focus on this md file is to organize and describe what the files in scoop (backend portion JAVA) will do
.mvn/
src/
    main/
        java/
            - where main java and main application class lives
    resources/
        - static files, templates, properties (resources)
    test/
mvnw: the maven wrapper
mvnw.cmd: the maven wrapper (others do not need to have maven installed)
pom.xml: dependencies, things your application needs

## Inside main/java/dev/heyezra/scoop
### /food
- This will have restaurants.
- May potentially recommend food based on weather (will need api to recommend based on weather) or if you are a sports fan, recommend restaurants offering specials or sports bar finder. Look at scores and if you are near an area with team-based promotions so example if local team wins, you can go here to get discount. 

### views
- spring mvc: model view controller
    model is the thing you are working with
    view how will we represent this (html page, rest api)
    controller the traffic cop. delegate and return a response. dumb

### Controller
Restaurant controller