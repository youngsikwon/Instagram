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
                let follow_item_el = document.querySelector("#follow_item_"+ i);
                follow_item_el.innerHTML = '<button onClick="follow(false,${userId}, #{i})" classs="following_btn">팔로잉</button>';
            }
        });
    }else{
        fetch(url,{
            method: "DELETE"
        }).then(function(res){
            return res.text();
        }).then(function(res){
            if(res === "ok"){
                let follow_item_el = document.querySelector("#follow_item_"+ i);
                follow_item_el.innerHTML = '<button onClick="follow(false,${userId}, #{i})" classs="follow_btn">팔로우</button>';
            }
        });
    }
}