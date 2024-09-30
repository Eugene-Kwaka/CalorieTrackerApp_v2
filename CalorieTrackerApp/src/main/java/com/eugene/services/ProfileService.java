package com.eugene.services;

import com.eugene.dto.ProfileDTO;

import java.util.List;

public interface ProfileService {
    public ProfileDTO createProfile(Long uId, ProfileDTO profileDTO);

    public List<ProfileDTO> getAllProfiles(Long uId);
    public ProfileDTO getProfile(Long pId);
    public ProfileDTO getProfileByUserId(Long uId);
    public ProfileDTO updateProfile(Long uId, Long pId, ProfileDTO profileDTO);
    //public ProfileDTO deleteProfile(int pId);
    public void deleteProfile(Long uId, Long pId);


}
