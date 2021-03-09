function follow(check, userId){
    // true -> follow �섍린
    // false -> unFollow �섍린
    let url = "/follow/"+userId;
    if(check){
        fetch(url,{
            method: "POST"
        }).then(function(res){
            return res.text();
        }).then(function(res){
            if(res === "ok"){
                let follow_check_el = document.querySelector("#follow_check");
                follow_check_el.innerHTML = "<button onClick='follow(false, "+userId+")' class='profile_edit_btn'>팔로우</button>";
            }
        });
    }else{
        fetch(url,{
            method: "DELETE"
        }).then(function(res){
            return res.text();
        }).then(function(res){
            if(res === "ok"){
                let follow_check_el = document.querySelector("#follow_check");
                follow_check_el.innerHTML = "<button onClick='follow(true, "+userId+")' class='profile_follow_btn'>팔로잉</button>";
            }
        });
    }
}