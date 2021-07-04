window.addEventListener('DOMContentLoaded', (event) => {
    console.log('DOM fully loaded and parsed');
});
function mapPassTestMethod(val) {
    console.log("reach here!");
    console.log(val);
    $.each(val,function(index,value){
        console.log(index);
        console.log(value);
    });
    //alert(val);
}