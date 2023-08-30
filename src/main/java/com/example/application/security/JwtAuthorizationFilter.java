package com.example.application.security;

//import java.io.IOException;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.util.StringUtils;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class JwtAuthorizationFilter extends OncePerRequestFilter {
//	  @Autowired
//	  private JwtUtil jwtUtil;
//
//	  @Autowired
//	  private CustomUserDetailsService customUserDetailsService;
//
//	  private static final Logger logger = LoggerFactory.getLogger(JwtAuthorizationFilter.class);
//
//	  @Override
//	  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//	      throws ServletException, IOException {
//	    try {
//	      String jwt = parseJwt(request);
//	      if (jwt != null && jwtUtil.validateJwtToken(jwt)) {
//	        String username = jwtUtil.getUserNameFromJwtToken(jwt);
//
//	        User userDetails = customUserDetailsService.loadUserByUsername(username);
//	        UsernamePasswordAuthenticationToken authentication =
//	            new UsernamePasswordAuthenticationToken(
//	                userDetails,
//	                null,
//	                userDetails.getAuthorities());
//	        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//
//	        SecurityContextHolder.getContext().setAuthentication(authentication);
//	      }
//	    } catch (Exception e) {
//	      logger.error("Cannot set user authentication: {}", e);
//	    }
//
//	    filterChain.doFilter(request, response);
//	  }
//
//	  private String parseJwt(HttpServletRequest request) {
//	    String headerAuth = request.getHeader("Authorization");
//
//	    if (StringUtils.hasText(headerAuth) && headerAuth.startsWith("Bearer ")) {
//	      return headerAuth.substring(7);
//	    }
//
//	    return null;
//	  }
//	}
