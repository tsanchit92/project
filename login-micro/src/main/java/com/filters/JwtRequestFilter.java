package com.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

	@Component
	public class JwtRequestFilter extends OncePerRequestFilter {

//		@Autowired
//		private MyUserDetailService userDetailsService;
		//
//		@Autowired
//		private JwtUtil jwtUtil;

		@Override
		protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
				throws ServletException, IOException {

			if (request.getServletPath().equals("/authenticate") || request.getServletPath().equals("/validate")) {
				chain.doFilter(request, response);
			}
//			} else {
//				final String authorizationHeader = request.getHeader("Authorization");

//				String username = null;
//				String jwt = null;
			//
//				if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
//					jwt = authorizationHeader.substring("Bearer ".length());
//					username = jwtUtil.extractUsername(jwt);
//				}
			//
//				if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			//
//					UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
			//
//					if (jwtUtil.validateToken(jwt, userDetails)) {
			//
//						UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
//								userDetails, null, userDetails.getAuthorities());
//						usernamePasswordAuthenticationToken
//								.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//						SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//						
//					}
//				}
//				chain.doFilter(request, response);
//			}

		}
	}
