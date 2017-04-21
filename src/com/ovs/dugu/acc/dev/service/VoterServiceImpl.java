package com.ovs.dugu.acc.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vs.online.voterservice.types.ActivityResponse;
import vs.online.voterservice.types.User;
import vs.online.voterservice.types.VoterInfo;
import vs.online.voterservice.types.VoterResponse;

import com.ovs.dugu.acc.dev.form.VoterForm;
import com.ovs.dugu.acc.dev.invoker.VoterServiceLocator;
import com.ovs.dugu.acc.dev.util.OVSUtil;

@Service
public class VoterServiceImpl implements OVService {
	@Autowired(required = true)
	private VoterServiceLocator serviceLocator;

	@Override
	public VoterResponse voteNow(VoterForm form) {
		VoterResponse voterResponse = null;
		try {
			VoterInfo voterInfo = OVSUtil.convertFormToPojo(form);
			voterResponse = serviceLocator.addVote(voterInfo);
		} catch (Exception e) {
			// Add logger here
			System.out.println(e.getMessage());
		}
		return voterResponse;
	}

	@Override
	public VoterForm getVoterDetails(String voterId) {
		User user=serviceLocator.getVoterDetails(voterId);
		VoterForm form=OVSUtil.convertPojoToForm(user.getVoterInfo());
		return form;
	}

	@Override
	public ActivityResponse getActivities(String voterType) {
		return serviceLocator.getActivity(voterType);
	}

}
