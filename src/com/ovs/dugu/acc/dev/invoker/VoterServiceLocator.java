package com.ovs.dugu.acc.dev.invoker;

import org.springframework.stereotype.Component;

import vs.online.voterservice.client.OnlineVoterService;
import vs.online.voterservice.client.ServiceActivityException;
import vs.online.voterservice.client.VoterService;
import vs.online.voterservice.types.ActivityResponse;
import vs.online.voterservice.types.User;
import vs.online.voterservice.types.VoterInfo;
import vs.online.voterservice.types.VoterResponse;

@Component
public class VoterServiceLocator {

	public VoterResponse addVote(VoterInfo voterInfo)
			throws ServiceActivityException {
		return getPort().addVote(voterInfo);
	}

	public User getVoterDetails(String voterId) {
		return getPort().getVoteDetailsByVoterId(voterId);
	}

	public ActivityResponse getActivity(String voterType) {
		return getPort().getVoteActivity(voterType);
	}

	public OnlineVoterService getPort() {
		return new VoterService().getVoterServiceSOAP();
	}
}
