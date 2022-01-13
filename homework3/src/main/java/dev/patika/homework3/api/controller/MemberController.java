package dev.patika.homework3.api.controller;

import dev.patika.homework3.model.Member;
import dev.patika.homework3.service.MemberService;
import dev.patika.homework3.service.PuanService;
import dev.patika.homework3.service.WatchlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {
        private final MemberService memberService;
        private final PuanService puanService;
        private final WatchlistService watchlistService;


        @GetMapping
        public ResponseEntity getAllMembers(){
            return new  ResponseEntity<>(memberService.getAllMembers().get(), HttpStatus.OK);
        }

         @GetMapping("/{id}")
         public ResponseEntity getMemberById(@PathVariable Long id) {
            return new ResponseEntity<>(memberService.getMemberById(id).get(),HttpStatus.OK);
         }

         @PostMapping
         public ResponseEntity createMember(@RequestBody Member member){
            return new ResponseEntity<>(memberService.saveMember(member).get(),HttpStatus.CREATED);
         }

         @DeleteMapping("/{id}")
        public ResponseEntity deleteMemberById(@PathVariable Long id){
            return new ResponseEntity<>(memberService.deleteMemberById(id).get(),HttpStatus.OK);
         }


         @GetMapping("/rateMovie/{movieId}/{memberId}/{point}")
             public ResponseEntity rateMovie(@PathVariable Long movieId,@PathVariable Long memberId,@PathVariable Long point){
               return new ResponseEntity<>(puanService.createPuan(movieId,memberId,point).get(),HttpStatus.OK);
         }


    @GetMapping("/watchlist/{memberId}/{name}")
    public ResponseEntity createWathclist(@PathVariable Long memberId,@PathVariable String name){
        return new ResponseEntity<>(watchlistService.createWatchlist(memberId,name).get(),HttpStatus.OK);
    }

    @GetMapping("/addmovieToWatchlist/{movieId}/{watchlistId}")
    public ResponseEntity addmovieToWatchlist(@PathVariable Long movieId,@PathVariable Long watchlistId){
        return new ResponseEntity<>(watchlistService.addMovieToWatchlist(movieId,watchlistId).get(),HttpStatus.OK);
    }

}
