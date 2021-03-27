package com.example.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListNormalCostumeDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<>();

        List<String> criteria = new ArrayList<>();
        criteria.add("Bãi tập phẳng");
        criteria.add("01 bộ mặt nạ");
        criteria.add("01 chiếc áo chữa cháy, cứu hộ");
        criteria.add("01 mũ bảo hộ");
        criteria.add("01 đai an toàn");
        criteria.add("01 đôi ủng");

        List<String> step = new ArrayList<>();
        step.add("Chiến sỹ cúi xuống xỏ ủng");
        step.add("Sau đó một tay đỡ đỉnh mũ, một tay cầm mũ đội lên đầu, mắc dây mũ vào cằm");
        step.add("Bắt chéo hai tay, xỏ vào ống tay áo, đứng lên quay về phía bên trái (hoặc bên phải) lật áo sang phía sau để mặc vào (trường hợp gập áo theo cách 2), hoặc xỏ hai tay vào tay áo, đứng lên, lật áo qua đầu ra phía sau để mặc (trường hợp gập áo theo cách 1)");
        step.add("Mặc áo xong, xoay người sang phải, cúi xuống, tay trái cầm thắt lưng đeo vào, khóa thắt lưng lại, đứng nghiêm và hô xong");

        expandableListDetail.put("Học cụ", criteria);
        expandableListDetail.put("Qui trình", step);
        return expandableListDetail;
    }
}
