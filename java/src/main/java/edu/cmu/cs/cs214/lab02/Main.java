package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Renderer renderer = new Renderer(rectangle);
        renderer.draw();

        Shape circle = new Circle(5);
        Renderer renderer2 = new Renderer(circle);
        renderer2.draw();

        Shape square = new Square(4);
        Renderer renderer3 = new Renderer(square);
        renderer3.draw();
    }
}



// •	Renderer нь зөвхөн Shape интерфейсийг ашиглаж байна, тодорхой нэг дүрсээс хамаарахгүй болсон.
// •	Main функц нь Rectangle биш, ерөнхий Shape төрлөөр ажиллаж байна, ингэснээр бусад дүрсүүдийг ч зураглах боломжтой.
// •	Битүүмжлэл сайжирсан, Renderer нь дотоод өгөгдөлд (width, height гэх мэт) хандахгүй, зөвхөн draw() методыг дуудаж байна.