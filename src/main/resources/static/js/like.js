function onFeedLoad(imageId) {
    let msg = like(imageId);
    if(msg === "ok"){
        $(this).toggleClass("heart-clicked fa-heart fa-heart-o");
    }else{
        alert("error");
    }
}

async function like(imageId){
    let response = await fetch(`/image/like/${imageId}`, {
        method : "POST"
    });
    let msg = await response.text();
    return msg;

}