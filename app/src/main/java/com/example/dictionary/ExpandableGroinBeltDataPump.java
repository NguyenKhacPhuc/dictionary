package com.example.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableGroinBeltDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<>();

        List<String> step = new ArrayList<>();
        step.add("Bước 1: Chiến sỹ sử dụng đoạn dây ngắn để làm đai háng, sử dụng 01 Karabiner móc vào đai");
        step.add("Bước 2: Tay phải cầm dây kéo vào, chiến sỹ xuống đứng quay lưng ra phía xuống (trong phạm vi an toàn), dùng nách kẹp dây, lòng bàn tay phải cầm dây, tay trái mở Karabiner và ấn xuống (mở khoá Karabiner), tay phải đưa đoạn dây phía dưới vào Karabiner từ phải qua trái một vòng, sau đó khoá Karabiner lại và đảo chiều Karabiner sao cho mặt có khoá hướng vào phía trong người.");
        step.add("Bước 3: Tay phải chiến sỹ nắm dây, bàn tay úp (hướng từ ngón trỏ đến ngón út theo chiều dây từ trên xuống dưới). Vị trí của tay phải ở phía sau và dưới thắt lưng. Tay trái cầm vào phần dây phía trên, tay phải cầm phần dây phía dưới và áp sát vào sau người để điều chỉnh tốc độ xuống cho chiến sỹ.\n" +
                "Khi chuẩn bị xong chiến sỹ hô “chuẩn bị xong”. Tiểu đội trưởng xác nhận và ra lệnh “được, đồng chí xuống”. Chiến sỹ bước ra ngoài, tay trái nắm phần dây trên, tay phải vẫn nắm chặt phần dây phía dưới và ép vào phía sau người để phanh và đu người ra ngoài. Chiến sỹ để hai chân thẳng áp vào tường, tay trái nắm dây (cánh tay giữ thẳng), tay phải phanh và để người ở tư thế ngồi sau đó tháo dây bảo hiểm và hô: “Tôi xuống”. Tiểu đội trưởng xác nhận dây chắc chắn, Karabiner khoá chặt thì ra lệnh “Xuống”.");
        step.add("Bước 4: Chiến sỹ bắt đầu xuống, tay trái nắm hờ vào dây, tay phải nắm hờ vào dây và cánh tay đưa thẳng ra phía sau, hướng xuống dưới (sao cho dây trượt từ từ trong lòng hai bàn tay). Khi xuống lưng luôn thẳng, mắt nhìn xuống điểm tiếp đất, mông xuống trước, hai chân thẳng, chân phải xuống trước, chân trái xuống sau.");
        step.add("Bước 5: Khi xuống gần đến mặt đất (cách khoảng 1m đến 1,5m) thì phanh lại, sau đó thực hiện việc tiếp đất và hô “xong”. Để phanh thì tay phải nắm chặt dây sau đó ép dây vào phía sau người. Sau khi chiến sỹ thứ nhất hoàn thành thì chiến sỹ tiếp theo tiến hành xuống, các bước tuần tự giống như chiến sỹ thứ nhất đã làm.");

        List<String> notice = new ArrayList<>();
        notice.add("+ Khi xuống tay trái nắm hờ phần dây phía trên giữ cho thân người luôn thẳng, tay phải nắm dây phía dưới để dây trượt tự do trong lòng bàn tay.");
        notice.add("+ Chiến sỹ trước khi xuống phải xác nhận điểm xuống.");
        notice.add("+ Khi xuống mắt luôn nhìn xuống dưới (bên phải người) để quan sát điểm sẽ tiếp đất, lưng phải thẳng.");
        notice.add("+ Người giữ dây: Luôn ở tư thế sẵn sàng hỗ trợ khi đồng đội gặp sự cố. Hai tay thẳng và nắm hờ vào dây hướng mắt lên trên nhìn đồng đội, khi đồng đội gần xuống đến mặt đất thì đứng tránh ra phía sau. Khi đồng đội gặp sự cố thì chiến sỹ nắm chặt lấy dây và kéo thẳng xuống dưới để cho dây căng.");
        notice.add("+ Trong quá trình xuống nếu gặp khoảng trống như cửa sổ... Thì đạp chân vào tường, nhún người để vượt qua.");

        expandableListDetail.put("step", step);
        expandableListDetail.put("notice", notice);

        return expandableListDetail;
    }
}
