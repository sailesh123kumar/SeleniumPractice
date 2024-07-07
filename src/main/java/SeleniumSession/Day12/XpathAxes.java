package SeleniumSession.Day12;

public class XpathAxes {

	// Parent to child
	// direct child : /
	// direct+indirect child : //

	// EX:
	// div[@id='content']/div ---[1]
	// div[@id='content']//div ---[7]

	// select[@class='Form_getForm_Country']/option --- 233
	// select[@class='Form_getForm_Country']//option --- 233

	// Child to Parent
	// input[@id='input-email']/.. ---Immediate parent
	// input[@id='input-email']/parent::div ---Immediate parent

	// https://selectorshub.com/xpath-practice-page/
	// a[text()='Joe.Root']/../preceding-sibling::td/input[@type='checkbox']
	// a[text()='Joe.Root']//ancestor::tr//input[@type='checkbox']

}
