package com.example.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableHoldRopeDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<>();

        List<String> stomatch = new ArrayList<>();
        stomatch.add("Chiến sĩ vòng dây quanh eo, có thể thực hiện tư thế ngồi hai chân mở rộng, duỗi thẳng, hoặc tư thế đứng (nếu có cấu kiện xây dựng có thể đạp chân vào).");
        stomatch.add("Tay trái nắm dây tại vị trí dưới rốn, tay phải nắm lấy đoạn dây bên phải eo");
        stomatch.add("Khi cần phải thả dây thì hai tay duỗi thẳng giữ dây, tay trái thả dây từ từ rồi nắm lấy điểm dây gần eo trái.");
        stomatch.add("Duỗi thẳng tay trái ra phía trước và kéo mạnh dây trong khi tay phải kéo mạnh dây ra phía sau lưng.");
        stomatch.add("Khi cần phải kéo dây thì hai tay duỗi thẳng giữ dây, tay trái kéo mạnh dây ra phía sau tay phải từ từ thả dây rồi nắm lấy điểm gần eo phải (làm ngược lại so với lúc thả dây). Hai tay nắm chặt dây tại vị trí dưới rốn.");

        List<String> shoulder = new ArrayList<>();
        shoulder.add("Trường hợp dây ở phía dưới (thấp hơn thắt lưng của chiến sĩ) lúc này chiến sĩ ở tư thế đứng chân trước chân sau chân trái ở phía trước tỳ vào cấu kiện xây dựng hoặc giẫm lên bậc để chân dưới cùng của thang (trường hợp giữ dây qua thang).");
        shoulder.add("Vòng dây dưới nách trái và lên vai phải, tay trái duỗi thẳng để giữ dây");
        shoulder.add("Tay phải giữ dây tại vị trí ngực phải.");
        shoulder.add("Khi cần phải thả dây thì tay phải thả dây từ từ, tay trái kéo dây xuống");
        shoulder.add("Khi cần phải kéo dây: Gập người về phía trước và kéo mạnh dây bằng tay phải sau đó giữ chặt lấy dây bằng hai tay.");
        shoulder.add("Ngả người ra phía sau và kéo mạnh dây lên trên về phía thân người. Khi cần dừng lại thì hai tay giữ chặt lấy dây.");

        expandableListDetail.put("Eo",stomatch);
        expandableListDetail.put("Vai",shoulder);
        return expandableListDetail;
    }
}
