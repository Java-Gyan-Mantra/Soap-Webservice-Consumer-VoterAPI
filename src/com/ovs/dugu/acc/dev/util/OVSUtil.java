package com.ovs.dugu.acc.dev.util;

import com.ovs.dugu.acc.dev.form.VoterForm;

import vs.online.voterservice.types.VoterInfo;

public class OVSUtil {

	public static VoterInfo convertFormToPojo(VoterForm form) {
		VoterInfo info = new VoterInfo();
		info.setName(form.getName());
		info.setState(form.getState());
		info.setDist(form.getDist());
		info.setGender(form.getGender());
		info.setAge(form.getAge());
		info.setVoterType(form.getVoterType());
		info.setCandidatesSign(form.getCandidatesSign());
		return info;
	}

	public static VoterForm convertPojoToForm(VoterInfo info) {
		VoterForm form = new VoterForm();
		form.setName(info.getName());
		form.setState(info.getState());
		form.setDist(info.getDist());
		form.setGender(info.getGender());
		form.setAge(info.getAge());
		form.setVoterType(info.getVoterType());
		form.setCandidatesSign(info.getCandidatesSign());
		return form;

	}
}
