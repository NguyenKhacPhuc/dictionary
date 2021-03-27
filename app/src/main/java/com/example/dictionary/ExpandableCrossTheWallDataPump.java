package com.example.dictionary;

import java.util.HashMap;

public class ExpandableCrossTheWallDataPump {
    public static HashMap<Integer, String> getData() {
        HashMap<Integer, String> expandableListDetail = new HashMap<>();

        expandableListDetail.put(1,"Còn cách tường chừng một bước chân thì dùng sức bật nhảy lên đạp mạnh chân trái (hoặc phải) vào mặt phẳng đứng của tường");
        expandableListDetail.put(2,"hai tay bám chặt mép tường trên (ngón tay cái phía trước, bốn ngón tay còn lại phía sau tường), co người lên chống thẳng hai tay lên mép tường");
        expandableListDetail.put(3,"Sau đó xoay bàn tay trái (hoặc phải) ngược về sau, lúc này bàn tay vừa xoay ngón tay cái phía sau, bốn ngón còn lại bám phía trước tường");
        expandableListDetail.put(4,"Gập người xuống, tay phải (hoặc trái) chống sâu xuống vào mặt tường phía đích");
        expandableListDetail.put(5,"hai chân khép lại lăng qua mép tường, kết hợp hai tay đẩy mạnh người về phía trước");
        expandableListDetail.put(6,"Kết thúc");

        return expandableListDetail;
    }
}
