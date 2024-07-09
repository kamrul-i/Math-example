package math_example;

public class Debugging {

    public static void main(String[] args) {
        
        //Debug is only one technique, it is only fun to use in Java.
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum = sum + i;
        }
        System.out.println("sum is : " + sum);
    }

    /*
    এখানে loop টি 10 পর্যন্ত আছে, 
    loop টি কত থেকে শুরু হচ্ছে, কোন result এর পর কোন result হচ্ছে, 
    যেভাবে চলতে চলতে loop টি শেষ হচ্ছে, তার পূর্ণ process সরাসরি দেখতে (debugging)-এ technique টি ব্যবহার করা হয়।।
    আবার, এ পদ্ধতির মাধ্যমে সরাসরি চিহ্নিত করা যায়, সমস্যা কোন যায়গা হচ্ছে।।
    
    
    যেমন, এখানে function 10-তম লাইনে আছে, 
    এ লাইনে cursor রেখে উপরের Debug menu থেকে "new watch" option-এ click করলে ১টি window আসবে,
    window-তে "sum" type করুন,
    আবার, Debug menu থেকে "new watch" option-এ click করলে ১টি window আসলে, window-তে "i" type করুন,
    
    এবার, 9-তম line-এ line-number এর উপর click করুন, (line breakpoint) দেখাবে এবং লাইন কালার করা হয়ে যাবে।।
    আবার, Debug menu থেকে "Debug file" option-এ click করুন, F8 button-এ click করুন।।
    এভাবে F8 button-এ click করতে থাকুন, আর নিচে sum & i মান কিভাবে change হচ্ছে, তা দেখতে থাকুন।।
    সম্পর্ণ result পর্যন্ত দেখতে থাকুন, অথবা F5 button-এ click করুন।।
     */
}
