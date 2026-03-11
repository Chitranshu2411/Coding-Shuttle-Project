package com.codingshuttle.projects.CodeNova_AI.service;

import java.util.List;

import com.codingshuttle.projects.CodeNova_AI.dto.member.InviteMemberRequest;
import com.codingshuttle.projects.CodeNova_AI.dto.member.MemberResponse;
import com.codingshuttle.projects.CodeNova_AI.dto.project.ProjectMember;
import org.jspecify.annotations.Nullable;

public interface ProjectMemberService {

    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}