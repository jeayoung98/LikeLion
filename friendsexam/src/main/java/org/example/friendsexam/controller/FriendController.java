package org.example.friendsexam.controller;

import lombok.RequiredArgsConstructor;
import org.example.friendsexam.domain.Friend;
import org.example.friendsexam.service.FriendService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("/friends")
public class FriendController {
    private final FriendService friendService;

    @GetMapping
    public String friends(Model model) {
        Iterable<Friend> friends = friendService.findAllFriends();
        model.addAttribute("friends", friends);
        return "friends/list";
    }
    // 친구등록 -- url 몇개 ? -- addForm add
    // friends/add -- Get -- 을 보여줘요 -- Post 등록해줘요

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("friend", new Friend());
        return "friends/form";
    }

    @PostMapping("/add")
    public String addFriend(@ModelAttribute Friend friend, RedirectAttributes redirectAttributes) {
        friendService.saveFriend(friend);
        redirectAttributes.addFlashAttribute("message", "친구등록 성공 !!");
        return "redirect:/friends";
    }

    // 친구 상세 페이지
    // localhost/friends/1

    @GetMapping("/{id}")
    public String detailFriend(@PathVariable Long id, Model model) {
        Friend friend = friendService.findFriendById(id);
        model.addAttribute("friend", friend);
        return "friends/detail";
    }

    @GetMapping("/delete/{id}")
    public String deleteFriend(@PathVariable Long id, Model model) {
        friendService.deleteFriendById(id);
        return "redirect:/friends";
    }

    // 수정 localhost/friends/edit --  Get 수정폼
    // 수정 localhost/friends/edit --  Post 수정
    @GetMapping("/edit/{id}")
    public String editFriend(@PathVariable Long id, Model model) {
        model.addAttribute("friend", friendService.findFriendById(id));
        return "friends/edit";
    }

    @PostMapping("/edit/{id}")
    public String editFriend(@ModelAttribute Friend friend){
        friendService.saveFriend(friend);
        return "redirect:/friends";
    }
}
