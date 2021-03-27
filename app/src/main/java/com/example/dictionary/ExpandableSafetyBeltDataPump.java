package com.example.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableSafetyBeltDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<>();

        List<String> step = new ArrayList<>();
        step.add("Bước 1: Chiến sỹ sử dụng 01 đai an toàn đeo vào người tại vị trí đai thắt lưng.");
        step.add("Bước 2: Chiến sỹ xuống đứng quay ra phía xuống (trong phạm vi an toàn).\n" +
                "Tay phải cầm và kéo đầu dây lên vị trí đứng, luồn đầu dây vào vòng khóa chữ D trên đai an toàn 1 vòng dây sao cho đầu dây sau khi luồn qua vòng khóa ở bên tay thuận (nếu chiến sỹ thuận tay phải thì luồn từ bên trái qua bên phải, nếu chiến sỹ thận tay trái thì luồn từ bên phải qua bên trái).\n" +
                "Điều chỉnh sao cho phần dây từ vòng khóa chữ D lên đến vị trí buộc vào cấu kiện căng sau đó thả phần dây phía dưới vòng khóa chữ D xuống phía dưới sao cho dây không bị xoắn.");
        step.add("Bước 3: Chiến sỹ bước ra vị trí xuống tiếp tục làm căng phân dây trên (nếu cần), tay phải nắm lấy phần dây dưới vòng khóa ở vị trí sao cho cánh tay thẳng, dây đi qua lòng bàn tay phải từ ngón út đến ngón cái (tay phải đóng vai trò là bộ phận khóa hãm điều chỉnh tốc độ xuống của chiến sỹ) tay tái nắm lấy phần dây phía trên vòng khóa ở vị trí sao cho cánh tay thẳng, dây đi qua lòng bàn tay trái từ trên xuống,từ ngón trỏ đến ngón út.\n" +
                "Khi chuẩn bị xong chiến sỹ hô “chuẩn bị xong”. Tiểu đội trưởng xác nhận và ra lệnh “được, đồng chí xuống”. Chiến sỹ thực hiện động tác tay phải nắm chặt dây đưa lên chập với dây phía trên sau đó từ từ bước ra ngoài khoảng không, hai mũi bàn chân tỳ vào tường, mắt hướng lên trên xác định điểm neo an toàn sau đó hướng xuống dưới xác định điểm xuống và hô “tôi xuống”.");
        step.add("Bước 4: Chiến sỹ bắt đầu xuống, tay trái nắm lỏng dây phía trên để định hướng thân người luôn thẳng, tay phải nắm phần dây phía dưới từ từ đưa xuống phía dưới đến khi dây bắt đầu di chuyển qua khóa chữ D trên đai an toàn thì điều chỉnh tốc độ xuống bằng cách tạo góc mở tại khóa chữ D giữa phần dây phía dưới với phía trên.");
        step.add("Bước 5: Khi xuống gần đến mặt đất (cách khoảng 1m đến 1,5m) thì phanh lại để xác định điểm tiếp đất, sau đó thực hiện việc tiếp đất và hô “xong”. Để phanh thì tay phải nắm chặt dây sau đó ép phần dây dưới vào phần dây trên như lúc chuẩn bị xuống.\n" +
                "Sau khi chiến sỹ thứ nhất hoàn thành thì chiến sỹ tiếp theo tiến hành xuống, các bước tuần tự giống như chiến sỹ thứ nhất đã làm.");

        List<String> notice = new ArrayList<>();
        notice.add("+ Khi xuống tay trái nắm hờ phần dây phía trên giữ thân người luôn thẳng, tay phải nắm dây phía dưới để dây trượt tự do trong lòng bàn tay.");
        notice.add("+ Khi xuống mắt luôn nhìn xuống dưới (bên phải người) để quan sát điểm sẽ tiếp đất, lưng phải thẳng.");
        notice.add("+ Người giữ dây: Luôn ở tư thế sẵn sàng hỗ trợ khi đồng đội gặp sự cố. Hai tay thẳng và nắm hờ vào dây hướng mắt lên trên nhìn đồng đội, khi đồng đội gần xuống đến mặt đất thì đứng tránh ra phía sau. Khi đồng đội gặp sự cố thì chiến sỹ nắm chặt lấy dây và kéo thẳng xuống dưới để cho dây căng.");
        notice.add("+ Trường hợp có Karabiner: Chiến sỹ sẽ móc phần thân dây vào Karabiner.");

        expandableListDetail.put("step", step);
        expandableListDetail.put("notice", notice);

        return expandableListDetail;
    }
}
