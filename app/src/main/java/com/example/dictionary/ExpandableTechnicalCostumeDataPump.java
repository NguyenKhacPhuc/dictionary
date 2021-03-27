package com.example.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableTechnicalCostumeDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<>();

        List<String> criteria = new ArrayList<>();
        criteria.add("01 bộ quần áo cách nhiệt");
        criteria.add("01 đôi ủng bảo hộ");
        criteria.add("01 đôi găng tay bảo hộ");
        criteria.add("01 mũ bảo hộ");
        criteria.add("01 chăn chiên trải trước các màn hình tại trạm kiểm tra khả năng mang thiết bị chuyên dụng");
        criteria.add("01 bộ mặt nạ cách ly");

        List<String> step = new ArrayList<>();
        step.add("Sau khi nghe khẩu lệnh “bắt đầu” của giáo viên, học viên sẽ tiến hành mang trang thiết bị chuyên dụng");
        step.add("Mặc quần áo cách nhiệt: học viên mặc quần trước, sau đó mặc áo");
        step.add("Đi ủng bảo hộ");
        step.add("Đeo găng tay bảo hộ");
        step.add("Đeo mặt nạ cách ly");
        step.add("Đội mũ bảo hộ");
        step.add("-\tKhi bài tập kết thúc, giáo viên cho thu hồi phương tiện,vệ sinh thiết bị và phòng tập, nhận xét, đánh giá chất lượng bài tập");

        expandableListDetail.put("Học cụ", criteria);
        expandableListDetail.put("Qui trình", step);
        return expandableListDetail;
    }
}
