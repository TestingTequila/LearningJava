package day34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListRealTimeExample {
    public static void main(String[] args) {

        List<String> amazonProduct = new ArrayList<>();
        amazonProduct.add("Iphone");
        amazonProduct.add("Laptop");
        amazonProduct.add("samsung Mobile");
        amazonProduct.add("Pen");
        amazonProduct.add("Stove");
        amazonProduct.add("Painting");
        System.out.println(amazonProduct); //[Iphone, Laptop, samsung Mobile, Pen, Stove, Painting]
        Collections.reverse(amazonProduct);//reverse
        System.out.println(amazonProduct); //[Painting, Stove, Pen, samsung Mobile, Laptop, Iphone]
        Collections.sort(amazonProduct);   //sort
        System.out.println(amazonProduct); //[Iphone, Laptop, Painting, Pen, Stove, samsung Mobile]
        Collections.swap(amazonProduct, 2, 3);
        System.out.println(amazonProduct); //[Iphone, Laptop, Pen, Painting, Stove, samsung Mobile]
    }
}
