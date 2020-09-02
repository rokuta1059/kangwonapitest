package com.kangwonapp.kangwonapi.notice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/department/notice")
public class NoticeJpaController {

    private final NoticeRepository noticeRepository;

    @GetMapping("/{department}")
    public List<notice> getNotice(@PathVariable String department) {
        return noticeRepository.findbyDepartmentALL(department);
    }

    @GetMapping("/all/{de}")
    public List<notice> getNotice1234(@PathVariable String de) {
        return noticeRepository.findByDepartmentOrderByDateAsc(de);
    }
}
