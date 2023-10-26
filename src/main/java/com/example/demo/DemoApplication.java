// package com.example.demo;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.GetMapping;

// @RestController
// @SpringBootApplication
// public class DemoApplication {

//     @GetMapping("/Flowers")
//     public Flower[] allFlowers() {
//         Flower[] flowers = new Flower[2];
//         flowers[0] = new Flower("Magnolia", 20, FlowerColor.RED);
//         flowers[1] = new Flower("Belucci", 20, FlowerColor.RED);
//         return flowers;
//     }

//     @GetMapping("/")
//     public String hehe(){
//         return "Hello hehe";
//     }
//     public static void main(String[] args) {
//         SpringApplication.run(DemoApplication.class, args);
//     }
// }
