package com.ovs.dugu.acc.dev.service;

import vs.online.voterservice.types.ActivityResponse;
import vs.online.voterservice.types.VoterResponse;

import com.ovs.dugu.acc.dev.form.VoterForm;

public interface OVService {

	public VoterResponse voteNow(VoterForm form);
	public VoterForm getVoterDetails(String voterId);
	public ActivityResponse getActivities(String voterType);
}
