package com.ovs.dugu.acc.dev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import vs.online.voterservice.types.ActivityResponse;
import vs.online.voterservice.types.VoterInfo;
import vs.online.voterservice.types.VoterResponse;

import com.ovs.dugu.acc.dev.form.VoterForm;
import com.ovs.dugu.acc.dev.service.OVService;

@Controller
public class VoterServiceController {
	@Autowired(required = true)
	private OVService service;

	@RequestMapping(value = "/addVote.aspx", method = RequestMethod.POST)
	public String voteNow(@ModelAttribute("form") VoterForm form, Model model) {
		String message = "";
		VoterResponse voterResponse = service.voteNow(form);
		message = "Hi " + form.getName() + " " + voterResponse.getResponse()
				+ " with unique id :" + voterResponse.getVoterId();
		model.addAttribute("message", message);
		return "vote";
	}

	@RequestMapping(value = "getStatus.aspx")
	public String getStatus(@RequestParam("voterId") String voterId, Model model) {
		List<VoterForm> user = null;
		try {
			VoterForm formData = service.getVoterDetails(voterId);
			user = new ArrayList<VoterForm>();
			user.add(formData);
			model.addAttribute("user", user);
		} catch (Exception e) {
			model.addAttribute("error_msg", "User Not found");
		}
		return "vote";
	}

	@RequestMapping(value = "/getActivity.aspx")
	public String getActivity(@RequestParam("voterType") String voterType,
			Model model) {
		String error_msg = "";
		int count = 0;
		List<VoterInfo> user = null;
		try {
			ActivityResponse response = service.getActivities(voterType);
			count = response.getVoteCount();
			user = response.getVoterInfo();
			model.addAttribute("count", count);
			model.addAttribute("user", user);
		} catch (Exception e) {
			model.addAttribute(error_msg, "Proxy Server Error");
		}
		return "vote";

	}
}
