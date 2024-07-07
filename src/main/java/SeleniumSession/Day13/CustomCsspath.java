package SeleniumSession.Day13;

public class CustomCsspath {
	
	//    #id
	//    #input-email
	
	//    htmltag#id
	//    input#input-email
	
	//   .className
	//   .form-control
	//   .img-responsive
	
	
	//   htmltag.className
	//   input.form-control
	//   img.img-responsive
	
	//  If multiple classes are avail
	//  .c1.c2.c3....
	// .form-control.private-form__control.login-email
	//  htmltag.c1.c2.c3....
	//  input.form-control.private-form__control.login-email
	//  input.login-email
	
	
	//   htmltag#id.className
	//   input#input-email.form-control
	
    //  htmltag.className#id
	//   input.form-control#input-email
	
	
	//   a.list-group-item  --- FEs ---13
	
	//   htmltag[attr='value']
	//   input[placeholder='E-Mail Address']  --- css
	//   //input[@placeholder='E-Mail Address'] --- xpath

	
    //  htmltag[attr1='value1'][attr2='value2'][attr3='value3']
	//   input[placeholder='E-Mail Address'][name='email'][type='text']   -- css
	//   input[placeholder][name='email'][type='text']   -- css
	//   input[placeholder][name][type='text']   -- css
	//   a[]href
	
	
	// contains
	//  input[placeholder*='E-Mail']
	//  input[placeholder*='Address']
	
	// starts-with
	//  input[placeholder^='E-Mail']
	
	//  ends-with
	//  input[placeholder$='Address']
	
	//text in css is ---->  not available
	
	
	//parent to child is available = Direct child
	//     select#Form_getForm_Country > option
	
	//parent to child is available = Direct child
	//     select#Form_getForm_Country  option
    //     div#content form > div > input#input-email
	
	
	//    nav#top > div  ---> Direct 
	//    nav#top  div  ---> Direct + indirect
	
	// child to parent/ancestor is not available : backward traversig in DOM is not allowed with css
	
	//sibling in css
	//preceding sibling not allowed
	//following-sibling is available
	
	//     label[for='input-email']+input#input-email
	//     label[for='input-password']+input+a --Direct immediate   --- we can traverse 1 by 1 only
	//     label[for='input-password']~a --indirect sibling  --- with this special character we can reach 3rd node of sibling
	
	// writing a path with css in DOM is the bad idea we can easily solve with xpath
	
	// indexing in css path
	//     select#Form_getForm_Country > option:first-child
	//     select#Form_getForm_Country > option:last-child
    //     select#Form_getForm_Country > option:nth-child(n)  --- all from top
	//     select#Form_getForm_Country > option:nth-child(20)   --- start from top
    //     select#Form_getForm_Country > option:nth-last-child(2)  --- start from bottom
    //     select#Form_getForm_Country > option:nth-child(odd)   --- give odd child
	//     select#Form_getForm_Country > option:nth-child(even)   --- give even child
    //     select#Form_getForm_Country > option:nth-child(4n)  --- multiplication with n times
	
	
	//odd / even in xpath
	
	//(//select/option)[position() mod 2 = 1]  --- odd
	//(//select/option)[position() mod 2 = 0]  --- even
	
	
	//not in css
	//     input.form-control:not(input[name='search'])
	//     input.form-control:not(input[name='search']):not(input[name='firstname'])

}
