window.onload = function(){
    $(".like").click((e) => {
        var btn = $(e.currentTarget);
        btn.attr("disabled", "disabled");

        const myBtn = e.target;
        var postId = btn.attr("data-post-id");
        $.post("/post/" + postId + "/like", (data) => {
            myBtn.innerText = "" + data + " ❤";
            myBtn.classList.remove('button-secondary');
            myBtn.classList.add('btn-danger');
        });
    });
};