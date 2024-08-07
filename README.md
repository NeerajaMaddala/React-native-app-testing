# React Native Chat App Testing

## Introduction 
What native chat app is about and what is the scope of testing (functional, performance & usability)

## Prerequesites 

- Download & Install Android Studio 
- Download & Install virtual devices 

## Environment setup
1. Open ANDROID STUDIO.
2. Click on more options 
3. Click on vertual device Manager option
4. start one of the emulator device (click on play button)
5. follow README instruction on https://github.com/Ctere1/react-native-chat. 
6. configure the server url  on the android emulator device (One time setting)

## Scope
Develop detailed test cases for the following functionalities:
- User signup
- User login
- Viewing the list of chat rooms
- Joining a chat room
- Sending and receiving messages
- Viewing user profiles
- Settings 
- Logout 
- Delete account 
- Profile 

> Note: Ensure the test cases cover both positive and negative scenarios.

## Prioritise Components (features) 

**For this step i would use an AISE Matrix, to identify the following combination:**

high impact high ease (P1 - High Impact customer's features and High ease Testing effort)

high impact low ease (P2 - High Impact customer's features and Low Testing effort)

Low impact high ease (P3 - Low customer impact features and High ease Testing effort)

Low impact low ease (P4 - Low customer impact features and Low Testing effort)

**The output of this step is a prioritised matrix**:

![alt text](image.png)


## Testing types 

- Task 1: Functional Testing
- Task 2: Usability Testing
- Task 3: Performance Testing


## Testing Approach  

In order to test the chat app,  I would follow the ACC (Attribute, component, capability) testing approach, this approach was design by google and its primary objective is to test capabilities over features, I personally find this approach very useful since it helps the team to have common understanding about the product or component

> Note: 
A capability is the intersection between an attribute and a component, for example we can be testing the Secure attribute of the login component, we can then say the 'Login component is Secure When un-authorized user Do NOT have access to ChatApp' 

**For the testing of ChatApp I would used the following attributes:**

**Secure**: Focus in finding any type of vulnerability in the application

**Compliance(Functional Testing)**: Focus in testing any expected results or acceptance criteria

**Auditable**: Focus in testing any transaction traceability

**Accessible**: Focus in testing the application from the perspective of a person with different abilities

**Responsive**: Focus in testing the application in different screen sizes and screen dimensions

**Usable (Usability Testing)**: Evaluating the overal user experience of the application including learnability

> Criteria: 
> - Evaluate the app’s user interface and user experience.
> - Identify any usability issues and provide suggestions for improvement.
> - Focus on aspects such as navigation, layout consistency, and user feedback.
> - Assess the ease of use for common tasks such as sending messages and navigating between chat rooms.

**Fast (Performance Testing)**: Evaluating the performance aspect of the application and its response time

> Criteria:  
> - Conduct basic performance testing to measure the app’s responsiveness and load times.
> - Test the app’s performance under different network conditions (e.g., 3G, 4G, Wi-Fi).
> - Measure the time taken for messages to be sent and received.
> - Document the performance metrics and any observed issues. 



