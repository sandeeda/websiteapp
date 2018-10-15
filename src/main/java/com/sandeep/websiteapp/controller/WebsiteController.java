package com.sandeep.websiteapp.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sandeep.websiteapp.entity.Item;

@Controller
public class WebsiteController {

	private int cartCount;
	private Set<Item> items;
	private Random r;
	int itemCount[] = new int[1000];
	int found;
	private int tempItemId;
	
	
	public WebsiteController() {
		cartCount=0;
		items = new HashSet<>();
		tempItemId=0;
		found=0;
		r = new Random();
		for (int i = 0; i < itemCount.length; i++) {
			itemCount[i]=0;
		}
	}
	
	@RequestMapping("/")
	public String getIndex() {
		return "index";
	}
	@RequestMapping("/addToCart")
	public String getIndexForCart(HttpServletRequest request,HttpSession session,@RequestParam int productId,@RequestParam int productPrice) {
		session = request.getSession();
		cartCount++;
		session.setAttribute("cartCount", cartCount);
		itemCount[productId]++;
		//System.out.println(productId);
		//System.out.println(itemCount[productId]);
		/*for (Iterator iterator = items.iterator(); iterator.hasNext();) {
			Item item = (Item) iterator.next();
			if (item.getItemProductId()==productId)
				item.setItemQuantity(item.getItemQuantity()+1);
			System.out.println(item);
				found=1;
		}*/
	
		Iterator iterator;
		iterator = items.iterator();
		
	/*	while(iterator.hasNext())
		{
			Item item = (Item) iterator.next();

			if(item.getItemProductId()==productId)
			{
				found=1;
				//0items.add(item.getItemId(), itemCount[productId], productId, productPrice));
				items.remove(item);
				items.add(new Item(item.getItemId(), itemCount[productId], productId, productPrice));
			}
		}*/
		
		for(Item item : items)
		{
			if(item.getItemProductId()==productId)
			{
				found=1;
				//0items.add(item.getItemId(), itemCount[productId], productId, productPrice));
				items.remove(item);
				items.add(new Item(item.getItemId(), itemCount[productId], productId, productPrice));
			}
		}
		
		if(found==0)
		{
			Item itemTemp = new Item(r.nextInt(500)+500, itemCount[productId], productId, productPrice);
			items.add(itemTemp);	
		}
		found=0;
		
	
		
		session.setAttribute("lineItems", items);
		
		System.out.println(items);
		System.out.println("\n");
		return "redirect:/";
	}
	
	@GetMapping("/deleteItem.do/{itemId}")
	public String deleteItem (@PathVariable int itemId)
	{
		Iterator iterator;
		iterator = items.iterator();
		
/*		while(iterator.hasNext())
		{
			Item item = (Item) iterator.next();

			if(item.getItemId() == itemId)
			{
				items.remove(item);
			}
		}*/
		
		for(Item item : items)
		{
			if(item.getItemId() == itemId)
			{
				items.remove(item);
			}
		}
		
		return "redirect:/showCart.do";
	}
	
	@RequestMapping("/showCart.do")
	public String showCart()
	{
		return "showCart";
	}
}
