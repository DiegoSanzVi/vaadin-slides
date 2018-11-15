[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/vaadin-flow/Lobby#?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

# Vaadin Slides

```java
VaadinSlide slideA = new VaadinSlide("400px","400px");
slideA.add(new H1("Diego"));
slideA.add(new Paragraph("My name is Diego"));

VaadinSlide slideB = new VaadinSlide("400px","400px");
slideA.add(new H1("Juan"));
slideA.add(new Paragraph("My name is Juan"));

VaadinSlide slideC = new VaadinSlide("400px","400px");
slideA.add(new H1("Suvi"));
slideA.add(new Paragraph("My name is Suvi"));

VaadinSlides presentation = new VaadinSlides(slideA,slideB,slideC);
// presentation set dimentions by default height and witdth of the presentation
add(presentation);
```

Run using `mvn jetty:run` and open [http://localhost:8080](http://localhost:8080) in browser.

For a full Vaadin Flow application example, there is the Beverage Buddy App Starter for Flow available also from [vaadin.com/start](https://vaadin.com/start) page.

Branching information:
* `master` the latest version of the starter, using latest platform snapshot
* `V10` the version for Vaadin 10
* `V11` the version for Vaadin 11